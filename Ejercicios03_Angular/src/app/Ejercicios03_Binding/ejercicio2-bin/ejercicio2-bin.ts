import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio2-bin',
  imports: [CommonModule],
  templateUrl: './ejercicio2-bin.html',
  styleUrl: './ejercicio2-bin.css',
})
export class Ejercicio2Bin {

  color?: string

  changeColor(newColor: string){
    this.color = newColor
    console.log(newColor)
  }
}
