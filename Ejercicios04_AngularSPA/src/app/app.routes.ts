import { Routes } from '@angular/router';
import { Home } from './Ejercicio_0_Angular/home/home';
import { QuienesSomos } from './Ejercicio_0_Angular/quienes-somos/quienes-somos';
import { DondeEstamos } from './Ejercicio_0_Angular/donde-estamos/donde-estamos';
import { FormularioContacto} from './Ejercicio_0_Angular/formulario-contacto/formulario-contacto';
import { Landing } from './landing/landing';
import { HomeEx1 } from './Ejercicio_1_Angular/home-ex1/home-ex1';
import { Parametro } from './Ejercicio_1_Angular/parametro/parametro';
import { HomeEx2 } from './Ejercicio_2_Angular/home-ex2/home-ex2';
import { Component } from '@angular/core';
import { DetallesPersona } from './Ejercicio_2_Angular/detalles-persona/detalles-persona';

export const routes: Routes = [

    {path: '', component:Landing},
    {path: 'home-ex0', component:Home},
    {path: 'quienes-somos', component:QuienesSomos},
    {path: 'donde-estamos', component:DondeEstamos},
    {path: 'contacto', component:FormularioContacto},
    {path: 'home-ex1', component:HomeEx1},
    {path: 'producto/:id', component:Parametro},
    {path: 'home-ex2', component: HomeEx2,},
    {path: 'home-ex2/persona/:nombre/:ciudad', component:DetallesPersona}
    

];
