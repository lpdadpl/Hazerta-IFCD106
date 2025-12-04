import { Component, NgModule } from '@angular/core';
import { AllBackButton } from '../../all-back-button/all-back-button';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';



@Component({
  selector: 'app-home-ex2',
  imports: [AllBackButton, FormsModule],
  templateUrl: './home-ex2.html',
  styleUrl: './home-ex2.css',
})
export class HomeEx2 {

  nombre: string = ""
  ciudad: string = ""

  constructor(private router:Router){}


  mandarInfo(route: string){
    console.log(this.ciudad)
    console.log(this.nombre)

    this.router.navigate([route, this.nombre, this.ciudad])
  }
}
