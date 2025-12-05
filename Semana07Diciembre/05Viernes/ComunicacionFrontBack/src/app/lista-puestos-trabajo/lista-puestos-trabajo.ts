import { Component } from '@angular/core';
import { ServicioPuestoTrabajo } from '../services/servicio-puesto-trabajo';
import { PuestoTrabajo } from '../modelo/puesto-trabajo';

@Component({
  selector: 'app-lista-puestos-trabajo',
  imports: [],
  providers: [ServicioPuestoTrabajo],
  templateUrl: './lista-puestos-trabajo.html',
  styleUrl: './lista-puestos-trabajo.css',
})
export class ListaPuestosTrabajo {

  puestosTrabajo!: PuestoTrabajo[]

  constructor(private servicioPuestoTrabajo: ServicioPuestoTrabajo){}

  ngOnInit(): void{
    this.servicioPuestoTrabajo.obtenerPuestoTrabajo().subscribe(datos=>{
      this.puestosTrabajo = datos
      console.log('datos recibidos')
    })
  }
}
