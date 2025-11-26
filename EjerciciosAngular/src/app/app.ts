import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1 } from './ejercicio1/ejercicio1';
import { Ejercicios } from './Ejercicios/Ejercicios';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Ejercicios  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('EjerciciosAngular');
}
