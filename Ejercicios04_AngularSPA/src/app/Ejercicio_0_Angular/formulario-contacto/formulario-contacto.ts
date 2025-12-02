import { Component } from '@angular/core';
import { Header } from '../header/header';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario-contacto',
  imports: [Header, FormsModule],
  templateUrl: './formulario-contacto.html',
  styleUrl: './formulario-contacto.css',
})
export class FormularioContacto {

  nombre: string = ""
  apellido: string = ""
  email: string = ""
  telefono: Number | undefined
  
  recibirMostrarDatos(nombre:any, apellido:any, email:any, telefono:any):void{
    console.log(nombre)
    console.log(apellido)
    console.log(email)
    console.log(telefono)
  }
}
