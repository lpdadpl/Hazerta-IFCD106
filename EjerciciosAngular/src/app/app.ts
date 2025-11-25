import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ejercicio1 } from './ejercicio1/ejercicio1';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Ejercicio1],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('EjerciciosAngular');
}
