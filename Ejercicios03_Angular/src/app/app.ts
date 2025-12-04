import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1Ts } from './Ejercicios01_Typescript/ejercicio1-ts/ejercicio1-ts';
import { Ejercicio2Ts } from './Ejercicios01_Typescript/ejercicio2-ts/ejercicio2-ts';
import { Ejercicio3Ts } from './Ejercicios01_Typescript/ejercicio3-ts/ejercicio3-ts';
import { Ejercicio4Ts } from './Ejercicios01_Typescript/ejercicio4-ts/ejercicio4-ts';
import { Ejercicio5Ts } from './Ejercicios01_Typescript/ejercicio5-ts/ejercicio5-ts';
import { Ejercicio6Ts } from './Ejercicios01_Typescript/ejercicio6-ts/ejercicio6-ts';
import { Ejercicio7Ts } from './Ejercicios01_Typescript/ejercicio7-ts/ejercicio7-ts';
import { Ejercicio8Ts } from './Ejercicios01_Typescript/ejercicio8-ts/ejercicio8-ts';
import { Ejercicio9Ts } from './Ejercicios01_Typescript/ejercicio9-ts/ejercicio9-ts';
import { Ejercicio1 } from './Ejercicios02_Angular/ejercicio1/ejercicio1';
import { Ejercicio2 } from './Ejercicios02_Angular/ejercicio2/ejercicio2';
import { Ejercicio3 } from './Ejercicios02_Angular/ejercicio3/ejercicio3';
import { Ejercicio4 } from './Ejercicios02_Angular/ejercicio4/ejercicio4';
import { Ejercicio42 } from './Ejercicios02_Angular/ejercicio4.2/ejercicio4.2';
import { Ejercicio5 } from './Ejercicios02_Angular/ejercicio5/ejercicio5';
import { Ejercicio1Bin } from "./Ejercicios03_Binding/ejercicio1-bin/ejercicio1-bin";
import { Ejercicio2Bin } from './Ejercicios03_Binding/ejercicio2-bin/ejercicio2-bin';
import { Ejercicio3Bin } from './Ejercicios03_Binding/ejercicio3-bin/ejercicio3-bin';
import { Ejercicio4Bin } from './Ejercicios03_Binding/ejercicio4-bin/ejercicio4-bin';
import { Ejercicio5Bin } from './Ejercicios03_Binding/ejercicio5-bin/ejercicio5-bin';
import { Ejercicio6Bin } from './Ejercicios03_Binding/ejercicio6-bin/ejercicio6-bin';
import { Ejercicio7Bin } from './Ejercicios03_Binding/ejercicio7-bin/ejercicio7-bin';
import { Ejercicio1Atrib } from './Ejercicios04_Directivas/ejercicio1-atrib/ejercicio1-atrib';
import { Ejercicio2Atrib } from './Ejercicios04_Directivas/ejercicio2-atrib/ejercicio2-atrib';
import { Ejercicio3Atrib } from './Ejercicios04_Directivas/ejercicio3-atrib/ejercicio3-atrib';
import { Ejercicio4Atrib } from './Ejercicios04_Directivas/ejercicio4-atrib/ejercicio4-atrib';
import { Ejercicio5Atrib } from './Ejercicios04_Directivas/ejercicio5-atrib/ejercicio5-atrib';
import { Ejercicio6Atrib } from './Ejercicios04_Directivas/ejercicio6-atrib/ejercicio6-atrib';
import { Ejercicio7Atrib } from './Ejercicios04_Directivas/ejercicio7-atrib/ejercicio7-atrib';


@Component({
  selector: 'app-root',
  imports: [
    Ejercicio1Ts, Ejercicio2Ts, Ejercicio3Ts, Ejercicio4Ts, Ejercicio5Ts, Ejercicio6Ts, Ejercicio7Ts, Ejercicio8Ts, Ejercicio9Ts,
    Ejercicio1, Ejercicio2, Ejercicio3, Ejercicio4, Ejercicio5,
    Ejercicio1Bin, Ejercicio2Bin, Ejercicio3Bin, Ejercicio4Bin, Ejercicio5Bin, Ejercicio6Bin, Ejercicio7Bin,
  Ejercicio1Atrib, Ejercicio2Atrib,Ejercicio3Atrib, Ejercicio4Atrib, Ejercicio5Atrib, Ejercicio6Atrib, Ejercicio7Atrib],
  templateUrl: './app.html',
  styleUrl: './app.css'
})


export class App {
  protected readonly title = signal('EjerciciosComponentes');
}
