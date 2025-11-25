import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio1',
  imports: [],
  templateUrl: './ejercicio1.html',
  styleUrl: './ejercicio1.css',
})
export class Ejercicio1 {

  texto: string = "Hola mundo";
  numero: number = 67;
  booleano: boolean = true;
  nulo: null = null;
  indefinido: undefined = undefined;

  constructor() {
    console.log(this.texto);
    console.log(this.numero);
    console.log(this.booleano);
    console.log(this.nulo);
    console.log(this.indefinido);
  }

}
