import { GerenteRoutingModule } from './gerente-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GerenteComponent } from './gerente.component';
import { AgmCoreModule } from "angular2-google-maps/core";


@NgModule({
  imports: [
    CommonModule,
    GerenteRoutingModule
    ],
    providers:[
  ],
    declarations: [GerenteComponent]
  ,exports:[GerenteComponent]
})
export class GerenteModule { }
