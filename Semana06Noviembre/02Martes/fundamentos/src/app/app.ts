import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FundamentosTypescript } from '../app/fundamentos-typescript/fundamentos-typescript'
import {Test} from '../app/test/test'
import { Locura } from '../app/locura/locura'
import { Prueba } from './prueba/prueba';
@Component({
  selector: 'primer-componente',
  imports: [RouterOutlet, FundamentosTypescript, Test, Locura, Prueba],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
/*
!
?
todo
palabra
*
@param myParam el parametro de la funcion
*/
export class App {
  protected readonly title = signal('fundamentos');
}
