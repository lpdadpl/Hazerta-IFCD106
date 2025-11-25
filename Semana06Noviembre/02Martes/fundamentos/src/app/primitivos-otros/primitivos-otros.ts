import { Component } from '@angular/core';

@Component({
  selector: 'app-primitivos-otros',
  imports: [],
  templateUrl: './primitivos-otros.html',
  styleUrl: './primitivos-otros.css',
})
export class PrimitivosOtros {
  
  tiposPrimerarios(): void {
    let nombre: string = 'Juan';
    let edad: number = 30;
    let esEstudiante: boolean = true;
    
  
  }
  
  tiposAvanzados(): void {
    let numeros: number[] = [1, 2, 3, 4, 5];
    let nombres: Array<string> = ['Ana', 'Luis', 'Carlos'];
    let tupla: [string, number] = ['Edad', 25];
    let cualquierTipo: any = 'Hola';
    
    numeros.push(6);
    nombres.push('Marta');
    cualquierTipo = 42;
    console.log(tupla);
    
  }

}