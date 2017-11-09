import { LoginService } from './../shared/services/login/login-service';
import { User } from './../shared/modelos/user-modelo';
import { routerTransition } from '../router.animations';
import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  animations: [routerTransition()]
  
})
export class LoginComponent implements OnInit {
  emailRegex = '^[a-z0-9]+(\.[_a-z0-9]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,15})$';
  alert = true;
  returnUrl: string;
  UserForm: FormGroup;
  user: User;
  submitted = false;

  constructor(
    private fb: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,

    private loginService: LoginService,

  ) {
    this.user = new User('', '', '');
  }

  ngOnInit(): void {
    this.buildForm();
    // reset login status
    this.loginService.logout();

    // get return url from route parameters or default to '/'
    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || 'dashboard';
    
  }

  buildForm(): void {
    this.UserForm = this.fb.group({
      'passaporte': [this.user.email, [
        Validators.required,
        Validators.minLength(4)
        // ,
        // Validators.pattern(this.emailRegex)
      ]
      ],
      'senha': [this.user.senha, [
        Validators.required,
        Validators.minLength(4)
      ]]
    });

    this.UserForm.valueChanges
      .subscribe(data => this.onValueChanged(data));

    this.onValueChanged();
  }

  onValueChanged(data?: any) {
    if (!this.UserForm) { return; }
    const form = this.UserForm;

    for (const field in this.formErrors) {
      // clear previous error message (if any)
      this.formErrors[field] = '';
      const control = form.get(field);

      if (control && control.dirty && !control.valid) {
        const messages = this.validationMessages[field];
        for (const key in control.errors) {
          this.formErrors[field] += messages[key] + ' ';
        }
      }
    }
  }

  formErrors = {
    'passaporte': ''
    ,
    'senha': ''
  };

  validationMessages = {
    'passaporte': {
      'required': 'Nome de usuário requerido.',
      'minlength': 'Nome tem que possuir mais de 4 caracteres'
    },
    'senha': {
      'required': 'Senha requirida.',
      'minlength': 'Senha tem que possuir mais de 4 caracteres'
    }
  };

  
  login() {

    this.loginService.logar(this.UserForm.get('passaporte').value, this.UserForm.get('senha').value)
      .subscribe(
      data => {
        this.router.navigate([this.returnUrl]);
        // if(localStorage.getItem('currentUser')){
        
        // };

      },
      error => {
        console.log('Erro');
        this.alert = false;
        setTimeout(() => this.alert = true, 10000);

      });
  }
}
