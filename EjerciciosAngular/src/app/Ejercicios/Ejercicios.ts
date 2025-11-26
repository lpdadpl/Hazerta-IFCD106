import { Component } from '@angular/core';

@Component({
  selector: 'app-Ejercicios',
  imports: [],
  templateUrl: './Ejercicios.html',
  styleUrl: './Ejercicios.css',
})
export class Ejercicios {

  texto: string = "Hola mundo";
  numero: number = 67;
  booleano: boolean = true;
  nulo: null = null;
  indefinido: undefined = undefined;


  Ejercicio1(): void {
    console.log(this.texto);
    console.log(this.numero);
    console.log(this.booleano);
    console.log(this.nulo);
    console.log(this.indefinido);
  }

  Ejercicio2(): void {

  }

  Ejercicio3(): void {

  }

  Ejercicio4(): void {

  }

  Ejercicio5(): void {

  }

  Ejercicio6(): void {

  }

  Ejercicio7(): void {

  }

  Ejercicio8(): void {

  }

}

