import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ejercicio5-bin',
  imports: [FormsModule],
  templateUrl: './ejercicio5-bin.html',
  styleUrl: './ejercicio5-bin.css',
})
export class Ejercicio5Bin {

  contador: number = 0;

  restOne(){
   this.contador--;
  }

  addOne(){
   this.contador++;
  }
  changeValue(newValue: string){
    this.contador = Number(newValue);
  }

  set0(){
    this.contador = 0;
  }

}
