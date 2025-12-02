import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-back-button',
  imports: [],
  templateUrl: './all-back-button.html',
  styleUrl: './all-back-button.css',
})
export class AllBackButton {

  constructor(private router:Router){}

  volverInicio(ruta: string):void{
    this.router.navigate([ruta])
  }
}
