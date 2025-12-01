import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio6-bin',
  imports: [FormsModule],
  templateUrl: './ejercicio6-bin.html',
  styleUrl: './ejercicio6-bin.css',
})
export class Ejercicio6Bin {

numero1: number = 0;
numero2: number = 0;
operacion: string = "";
resultado: number = 0;


  Calculadora(operacion: string, numero1: number, numero2: number){
    switch(operacion){
      case 'suma':
        this.resultado = numero1 + numero2;
        break;
    
      case 'resta':
        this.resultado = numero1 - numero2;
        break;
    
      case 'multiplicacion':
        this.resultado = numero1 * numero2;
        break;
    
      case 'division':
        this.resultado = numero1 / numero2;
        break;
    }
  }
}
