import { Component, signal } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { Desde } from './desde/desde';
import { Hacia } from './hacia/hacia';
import { Parametro } from './parametro/parametro';
import { Home } from './home/home';

@Component({
  selector: 'app-root',
  imports: [RouterModule, RouterOutlet,
    Desde, Hacia, Parametro, Home
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('RoutingAngular');
}
