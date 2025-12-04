import { Component } from '@angular/core';
import { AllBackButton } from '../../all-back-button/all-back-button';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home-ex2',
  imports: [AllBackButton],
  templateUrl: './home-ex2.html',
  styleUrl: './home-ex2.css',
})
export class HomeEx2 {

  nombre?: string
  ciudad?: string

constructor(private route:ActivatedRoute){}
  
  ngOnInit(): void {

    this.route.paramMap.subscribe(params => {
      this.nombre = params.get('nombre') ?? '';
      this.ciudad = params.get('ciudad') ?? '';
      console.log('Parámetro de Persona recibidos:', this.nombre, ' y ', this.ciudad);
    });
  }
}