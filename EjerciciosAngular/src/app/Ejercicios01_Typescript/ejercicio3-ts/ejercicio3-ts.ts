import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio3-ts',
  imports: [],
  templateUrl: './ejercicio3-ts.html',
  styleUrl: './ejercicio3-ts.css',
})
export class Ejercicio3Ts {
  Numero: number = 0;

  isOdd(): boolean {
    const esImpar = this.Numero % 2 !== 0;
    console.log(`El número ${this.Numero} es ${esImpar ? 'impar' : 'par'}`);
    return esImpar;
  }

  checkNumber(valor: number): void {
    this.Numero = valor;
    this.isOdd();
  }
}
