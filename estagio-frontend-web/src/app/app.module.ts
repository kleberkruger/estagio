import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { FlexLayoutModule } from "@angular/flex-layout";

import { TextMaskModule } from 'angular2-text-mask';

import { AppRoutingModule } from './app-routing.module';

import { AngularMaterialModule } from './shared/angular-material/angular-material.module';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { TelefonesComponent } from './telefones/telefones.component';
import { TelefoneFormComponent } from './telefones/telefone-form/telefone-form.component';
import { DemoGridColumnSpanComponent } from './demo-grid-column-span/demo-grid-column-span.component';
import { MeuPerfilComponent } from './meu-perfil/meu-perfil.component';
import { SlidenavComponent } from './slidenav/slidenav.component';
import { EnderecoFormComponent } from './endereco-form/endereco-form.component';

@NgModule({
  declarations: [ 
    AppComponent, 
    LoginComponent, 
    PageNotFoundComponent, 
    TelefonesComponent, 
    TelefoneFormComponent, 
    DemoGridColumnSpanComponent, MeuPerfilComponent, SlidenavComponent, EnderecoFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    FlexLayoutModule,
    AngularMaterialModule,
    AppRoutingModule,
    HttpModule,
    TextMaskModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
