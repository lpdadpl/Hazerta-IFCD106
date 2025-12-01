import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio7-bin',
  imports: [FormsModule],
  templateUrl: './ejercicio7-bin.html',
  styleUrl: './ejercicio7-bin.css',
})
export class Ejercicio7Bin {


  cantidad: number = 0;
  divisa: string = "";
  newdivisa: string = "";
  cambio: number = 0;

  cambios: { [key: string]: number } = {
    'EUR-USD': 1.1586,
    'EUR-GBP': 0.8776,
    'USD-EUR': 1 / 1.1586,
    'USD-GBP': 0.7575,
    'GBP-EUR': 1 / 0.8776,
    'GBP-USD': 1 / 0.7575
  }

  CalculadoraDeDivisas(divisa: string, newdivisa: string, numero1: number){

    switch(divisa){

      case 'euro':
        switch(newdivisa){
          case 'dolar':
            this.cambio = numero1 * 1*15; 
            break;
          case 'libra':
            this.cambio = numero1 *0.87;
            break;
          case 'euro':
            this.cambio = numero1;
            break;
        }
        break;
      case 'dolar':
        switch(newdivisa){
          case 'euro':
            this.cambio = numero1 * 1/1.15;
            break;
          case 'libra':
            this.cambio = numero1 * 0.75;
            break;
          case 'dolar':
            this.cambio = numero1;
            break;
        }
        break;
      case 'libra':
        switch(newdivisa){
          case 'euro':
            break;
            this.cambio = numero1 * 1/0.87;
          case 'dolar':
            break;
            this.cambio = numero1 * 1/0.75;
          case 'libra':
            this.cambio = numero1;
            break;
        }
    }
  }
}
