import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio1-bin',
  imports: [],
  templateUrl: './ejercicio1-bin.html',
  styleUrl: './ejercicio1-bin.css',
})
export class Ejercicio1Bin {

  numero1: number = 6;
  numero2: number = 7;

  suma: number = this.numero1 + this.numero2;
}
