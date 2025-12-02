import { Component, signal } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { AllBackButton } from './all-back-button/all-back-button';

@Component({
  selector: 'app-root',
  imports: [RouterModule, RouterOutlet,
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Ejercicios05_AngularSPA');

  constructor(private router: Router) {}


  navegarA(ruta: string) {
    this.router.navigate([ruta]);

  }
}
