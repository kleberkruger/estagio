import { LoginService } from './../shared/services/login/login-service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { LoginRoutingModule } from './login-routing.module';



import { LoginComponent } from './login.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    LoginRoutingModule,
    ReactiveFormsModule
  ],
  providers: [ LoginService],
  declarations: [LoginComponent,
  ],
  exports: [LoginComponent]
})
export class LoginModule { }
