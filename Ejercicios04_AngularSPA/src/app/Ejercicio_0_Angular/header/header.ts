import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { AllBackButton } from '../../all-back-button/all-back-button';

@Component({
  selector: 'app-header',
  imports: [RouterModule, AllBackButton],
  templateUrl: './header.html',
  styleUrl: './header.css',
})
export class Header {

    constructor(private router: Router) {}


  navegarA(ruta: string) {
      this.router.navigate([ruta]);
    }


}
