import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
    {
        path: '', component: LayoutComponent,

        children: [
            { path: 'dashboard', loadChildren: './dashboard/dashboard.module#DashboardModule' },
            { path: 'configuracoes', loadChildren: './configuracoes/configuracoes.module#ConfiguracoesModule' },
            { path: 'gerente', loadChildren: './gerente/gerente.module#GerenteModule' },
            { path: 'profile', loadChildren: './profile/profile.module#ProfileModule' }
        ]
    }
    // ,
    // {
    //     // path: 'configuracoes', component: './configuracoes/configuracoes.module#ConfiguracoesModule',
    //     // path: 'configuracoes', component: ConfiguracoesComponent,
    //     path: 'configuracoes', loadChildren: './configuracoes/configuracoes.module#ConfiguracoesModule'
    // }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule { }
