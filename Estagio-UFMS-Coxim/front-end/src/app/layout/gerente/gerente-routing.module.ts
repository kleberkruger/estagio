import { GerenteComponent } from './gerente.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
    { path: '', component: GerenteComponent,
   children: [ ]
    }    ]
        

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class GerenteRoutingModule { }
