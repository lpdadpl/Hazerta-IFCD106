import { Routes } from '@angular/router';
import { Home } from './home/home';
import { QuienesSomos } from './quienes-somos/quienes-somos';
import { DondeEstamos } from './donde-estamos/donde-estamos';
import { FormularioContacto} from './formulario-contacto/formulario-contacto';

export const routes: Routes = [

    {path: '', component:Home},
    {path: 'home', component:Home},
    {path: 'quienes-somos', component:QuienesSomos},
    {path: 'donde-estamos', component:DondeEstamos},
    {path: 'contacto', component:FormularioContacto},

];
