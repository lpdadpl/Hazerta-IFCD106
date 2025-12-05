import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UsoServicio } from './uso-servicio/uso-servicio';
import { FormularioReactivo } from './formulario-reactivo/formulario-reactivo';

@Component({
  selector: 'app-root',
  imports: [ UsoServicio, FormularioReactivo],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ComunicacionFrontBack');
}
