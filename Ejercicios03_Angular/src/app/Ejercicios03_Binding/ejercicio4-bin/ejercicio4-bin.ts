import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio4-bin',
  imports: [],
  templateUrl: './ejercicio4-bin.html',
  styleUrl: './ejercicio4-bin.css',
})
export class Ejercicio4Bin {

  texto: string = 'valor por defecto';

  changeText(nuevotexto: string){
    this.texto = nuevotexto
  }


}
