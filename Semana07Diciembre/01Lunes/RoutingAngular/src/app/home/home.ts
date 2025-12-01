import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-home',
  imports: [RouterModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  constructor(private router: Router) {}

  irA(ruta: string, param?: number) {
    if (param) {
      this.router.navigate([ruta, param]);
    } else {
      this.router.navigate([ruta]);
    }
  }
}
