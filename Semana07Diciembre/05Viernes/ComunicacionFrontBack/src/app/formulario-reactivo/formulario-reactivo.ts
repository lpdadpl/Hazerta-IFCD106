import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario-reactivo',
  imports: [ReactiveFormsModule],
  templateUrl: './formulario-reactivo.html',
  styleUrl: './formulario-reactivo.css',
})
export class FormularioReactivo {

    formulario = new FormGroup({
      nombre: new FormControl(''),
    })

    enviar(){
      /* Lista de valores */
      console.log('Valor del formulario', this.formulario.value )
      /* Valor concreto */
      console.log('Valor del formulario', this.formulario.value.nombre )
    }
}
