import { Component } from '@angular/core';
import { Route, Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-desde',
  imports: [RouterModule],
  templateUrl: './desde.html',
  styleUrl: './desde.css',
})
export class Desde {

constructor (private rutas: Router){}

navegar(){
this.rutas.navigate(['/hacia'])
}

irAParametro(){
this.rutas.navigate(['/parametro', 123]);
}
}
