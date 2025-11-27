import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio3-bin',
  imports: [],
  templateUrl: './ejercicio3-bin.html',
  styleUrl: './ejercicio3-bin.css',
})
export class Ejercicio3Bin {


  isDisabled: boolean= false;


  changeAbleOrNot(){
    this.isDisabled = !this.isDisabled;
  }
}
  