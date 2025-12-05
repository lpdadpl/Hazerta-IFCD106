import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UsoServicio } from './uso-servicio/uso-servicio';
import { FormularioReactivo } from './formulario-reactivo/formulario-reactivo';
import { ServicioPuestoTrabajo } from './services/servicio-puesto-trabajo';

@Component({
  selector: 'app-root',
  imports: [ UsoServicio, FormularioReactivo],
  providers: [ServicioPuestoTrabajo],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ComunicacionFrontBack');
}
