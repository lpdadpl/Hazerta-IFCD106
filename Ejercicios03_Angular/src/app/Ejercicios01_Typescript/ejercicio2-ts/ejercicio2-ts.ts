import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio2-ts',
  templateUrl: './ejercicio2-ts.html',
  styleUrls: ['./ejercicio2-ts.css'],
})
export class Ejercicio2Ts {

  texto: string = 'Hola, TypeScript!';
  numero: number = 42;
  mensajeError: string = '';

  declaracionVariables(): void {
    // ...existing code...
  }

  updateDatos(nuevoTexto: string, nuevoNumero: string): void {
    this.mensajeError = '';
    this.texto = nuevoTexto;
    const n = Number(nuevoNumero);
    if (isNaN(n)) {
      this.mensajeError = 'Número inválido';
    } else {
      this.numero = n;
    }
    console.log(this.numero);
    console.log(this.texto);
    console.log('Datos actualizados:', this.texto, this.numero);

  }


}
