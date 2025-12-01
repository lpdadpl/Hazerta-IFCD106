import { Routes } from '@angular/router';
import { Hacia } from './hacia/hacia';
import { Parametro } from './parametro/parametro';
import { Desde } from './desde/desde';
import { ErrorNavegacion } from './error-navegacion/error-navegacion';
import { Home } from './home/home';

export const routes: Routes = [

    {path: '', component:Home},
    {path: 'home', component:Home},
    {path: 'desde', component:Desde},
    {path: 'hacia', component:Hacia},
    {path: "parametro/:id", component:Parametro},
    {path: "**", component:ErrorNavegacion}
];
