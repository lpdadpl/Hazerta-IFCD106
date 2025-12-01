import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio1-ts',
  imports: [],
  templateUrl: './ejercicio1-ts.html',
  styleUrl: './ejercicio1-ts.css',
})
export class Ejercicio1Ts {

  texto: string = 'Hola, este es el primer ejercicio de TypeScript en Angular';
  numero: number = 67;
  booleano: boolean = true;
  nulo: null = null;
  indefinido: undefined = undefined;

  imprimirValores(): void {
    console.log('Texto:', this.texto);
    console.log('Número:', this.numero);
    console.log('Booleano:', this.booleano);
    console.log('Nulo:', this.nulo);
    console.log('Indefinido:', this.indefinido);
  }

}
