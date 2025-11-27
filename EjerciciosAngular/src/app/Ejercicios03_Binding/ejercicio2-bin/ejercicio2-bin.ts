import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio2-bin',
  imports: [],
  templateUrl: './ejercicio2-bin.html',
  styleUrl: './ejercicio2-bin.css',
})
export class Ejercicio2Bin {

  color: string = "red";


  changeColor(newColor: string){
    this.color = newColor
  }
}
