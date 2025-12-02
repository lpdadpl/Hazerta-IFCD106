import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Parametro } from '../parametro/parametro';
import { AllBackButton } from '../../all-back-button/all-back-button';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home-ex1',
  imports: [ AllBackButton, FormsModule],
  templateUrl: './home-ex1.html',
  styleUrl: './home-ex1.css',
})
export class HomeEx1 {

  constructor(private router: Router) {}

  id: Number = 0;

  navegarA(ruta: string, parametro:Number){
    this.router.navigate([ruta, parametro])
  }

}
