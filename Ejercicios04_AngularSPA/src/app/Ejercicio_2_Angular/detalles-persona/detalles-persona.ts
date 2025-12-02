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

  nombre: String | null = null
  ciudad: String | null = null

  
  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.route.paramMap.subscribe(params => {
      this.nombre = params.get('nombre'),
      this.ciudad = params.get('ciudad')
      ;
      console.log('Parámetro de Persona recibidos:', this.nombre, ' y ', this.ciudad);
    });
  }

}
