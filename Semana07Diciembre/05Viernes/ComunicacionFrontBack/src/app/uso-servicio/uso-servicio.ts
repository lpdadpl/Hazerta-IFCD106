import { Component, OnInit } from '@angular/core';
import { Demo01 } from '../services/demo01';

@Component({
  selector: 'app-uso-servicio',
  imports: [],
  templateUrl: './uso-servicio.html',
  styleUrl: './uso-servicio.css',
})


export class UsoServicio implements OnInit{

  constructor(private servicio: Demo01){}


  ngOnInit(): void {
    this.servicio.log('UsoServicio Initialized')
  }

  UsarServicio(){
    this.servicio.log('Servicio de mensaje solicitado manualmente')
  }
}
