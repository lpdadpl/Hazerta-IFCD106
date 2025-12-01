import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-hacia',
  imports: [RouterModule],
  templateUrl: './hacia.html',
  styleUrl: './hacia.css',
})
export class Hacia {
  constructor(private rutas: Router) {}

  navegar() {
    this.rutas.navigate(['/desde']);
  }
}
