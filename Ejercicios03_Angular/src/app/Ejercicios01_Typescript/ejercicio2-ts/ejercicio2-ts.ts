import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio2-ts',
  imports: [CommonModule],
  template: ` <div>
                <div>
                    <label
                      >Texto:
                      <input type="text" #txt placeholder="Nuevo texto" />
                    </label>
                </div>
                <div>
                    <label class="m-1.5">
                      Número:
                      <input type="text" #num placeholder="Nuevo número" />
                    </label>
                </div>
                <div>
                    <button class=" p-1 border-gray-600 border rounded-2xl" (click)="updateDatos(txt.value, num.value)">Actualizar</button>
                </div>
                  @if(mensajeError){
                  <div style="color: red" >{{ mensajeError }}</div>
                }@else{
                  <div>Todo ha ido bien</div>
                  }
              </div>
`,
  styleUrls: ['./ejercicio2-ts.css'],
})
export class Ejercicio2Ts {

  texto: string = 'Hola, TypeScript!';
  numero?: number
  mensajeError?: string

  declaracionVariables(): void {
    // ...existing code...
  }

  updateDatos(nuevoTexto: string, nuevoNumero: string): void {
    this.mensajeError = "Error Garrafal"
    this.texto = nuevoTexto;
    const n = Number(nuevoNumero);
    if (isNaN(n)) {
      this.mensajeError = 'Número inválido';
    } else {
      this.numero = n;
      this.mensajeError= "todo fino";
    }
    console.log(this.numero);
    console.log(this.texto);
    console.log('Datos actualizados:', this.texto, this.numero);
    console.log(this.mensajeError);

  }


}
