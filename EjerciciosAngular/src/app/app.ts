import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1 } from './Ejercicios02_Angular/ejercicio1/ejercicio1';
import { Ejercicio2 } from './Ejercicios02_Angular/ejercicio2/ejercicio2';
import { Ejercicio3 } from './Ejercicios02_Angular/ejercicio3/ejercicio3';
import { Ejercicio4 } from './Ejercicios02_Angular/ejercicio4/ejercicio4';
import { Ejercicio42 } from './Ejercicios02_Angular/ejercicio4.2/ejercicio4.2';
import { Ejercicio5 } from './Ejercicios02_Angular/ejercicio5/ejercicio5';
import { Ejercicio1Ts } from './Ejercicios01_Typescript/ejercicio1-ts/ejercicio1-ts';
import { Ejercicio2Ts } from './Ejercicios01_Typescript/ejercicio2-ts/ejercicio2-ts';
import { Ejercicio3Ts } from './Ejercicios01_Typescript/ejercicio3-ts/ejercicio3-ts';
import { Ejercicio4Ts } from './Ejercicios01_Typescript/ejercicio4-ts/ejercicio4-ts';
import { Ejercicio5Ts } from './Ejercicios01_Typescript/ejercicio5-ts/ejercicio5-ts';
import { Ejercicio6Ts } from './Ejercicios01_Typescript/ejercicio6-ts/ejercicio6-ts';
import { Ejercicio7Ts } from './Ejercicios01_Typescript/ejercicio7-ts/ejercicio7-ts';
import { Ejercicio8Ts } from './Ejercicios01_Typescript/ejercicio8-ts/ejercicio8-ts';
import { Ejercicio9Ts } from './Ejercicios01_Typescript/ejercicio9-ts/ejercicio9-ts';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet,
    Ejercicio1Ts, Ejercicio2Ts, Ejercicio3Ts, Ejercicio4Ts, Ejercicio5Ts, Ejercicio6Ts, Ejercicio7Ts, Ejercicio8Ts, Ejercicio9Ts,
    Ejercicio1, Ejercicio2, Ejercicio3, Ejercicio4, Ejercicio42, Ejercicio5],
  templateUrl: './app.html',
  styleUrl: './app.css'
})


export class App {
  protected readonly title = signal('EjerciciosComponentes');
}
