import { Component, OnInit, OnChanges, Input, SimpleChanges } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs/Observable';

import { Telefone, UsoTelefone } from './telefone';

import { ViewEncapsulation } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { MatIconRegistry } from '@angular/material';

import 'rxjs/add/operator/startWith';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-telefone-form',
  templateUrl: './telefone-form.component.html',
  styleUrls: ['./telefone-form.component.scss']
})
export class TelefoneFormComponent implements OnInit {

  @Input()
  private telefone: Telefone;

  private editando: boolean;

  private usoControl = new FormControl('', [Validators.required]);
  private usos = ['Pessoal', 'Trabalho', 'Ramal UFMS', 'Recado'];

  private formControl: FormControl = new FormControl();

  private operadoras = ['Algar Telecom', 'Claro', 'Nextel', 'Oi', 'Porto Seguro Conecta', 'TIM', 'Vivo'];
  private operadorasFiltradas: Observable<string[]>;

  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) {
    // Registrando novos ícones
    iconRegistry.registerFontClassAlias('fontawesome', 'fa');
  }

  ngOnInit() {
    this.operadorasFiltradas = this.formControl.valueChanges
      .startWith('')
      .map(val => this.filtrar(val));

      this.setEditar(false);
  }

  ngOnChanges(changes: SimpleChanges) {
  }

  private filtrar(val: string): string[] {
    return this.operadoras.filter(option =>
      option.toLowerCase().indexOf(val.toLowerCase()) === 0);
  }

  private isCelular(): boolean {
    var numeroStr: string = this.telefone.numero.replace(/[^0-9]/g, '');
    return numeroStr[2] == '9';
  }

  private isRecado(): boolean {
    return this.telefone.uso.toString() === 'Recado';
  }

  private setEditar(b: boolean) {
    this.editando = b;
    if (this.editando) {
      this.usoControl.enable();
      this.formControl.enable();
    } else {
      this.usoControl.disable();
      this.formControl.disable();
    }
  }

  private editar() {
    this.setEditar(!this.editando);
  }

  private salvar() {
    this.editar();
  }

  private floatPlaceholderValue(): string {
    if (!this.editando) {
      return 'always';
    }
    return 'auto';
  }

  private mask(userInput) {
    let numbers = userInput.match(/\d/g);
    let numberLength = 0;
    if (numbers) {
      numberLength = numbers.join("").length;
    }

    if (numberLength > 10) {
      return ['(', /[1-9]/, /[1-9]/, ')', ' ', /\d/, /\d/, /\d/, /\d/, /\d/, '-', /\d/, /\d/, /\d/, /\d/];
    } else {
      return ['(', /[1-9]/, /[1-9]/, ')', ' ', /\d/, /\d/, /\d/, /\d/, '-', /\d/, /\d/, /\d/, /\d/];
    }
  }

}
