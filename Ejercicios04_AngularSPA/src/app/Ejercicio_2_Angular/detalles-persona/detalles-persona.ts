import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BackHome } from '../back-home/back-home';

@Component({
  selector: 'app-detalles-persona',
  imports: [BackHome],
  templateUrl: './detalles-persona.html',
  styleUrl: './detalles-persona.css',
})
export class DetallesPersona {

  nombre?: string 
  ciudad?: string 

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.nombre = this.route.snapshot.paramMap.get('nombre') || '';
    this.ciudad = this.route.snapshot.paramMap.get('ciudad') || '';
  }


}


