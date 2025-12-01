import { NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio1-atrib',
  standalone: true,
  imports: [NgStyle],
  templateUrl: './ejercicio1-atrib.html',
  styleUrls: ['./ejercicio1-atrib.css'],
})
export class Ejercicio1Atrib {

  esActivo: boolean = true;
  
  changeActivo(){
    this.esActivo = !this.esActivo
    console.log(this.esActivo)

  }
}
