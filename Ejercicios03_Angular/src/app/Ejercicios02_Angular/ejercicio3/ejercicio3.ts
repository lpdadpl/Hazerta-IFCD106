import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicio3',
  imports: [CommonModule],
  templateUrl: './ejercicio3.html',
  styleUrl: './ejercicio3.css',
})
export class Ejercicio3 {

  contador: number = 0;
  listaCosas: string[] = ["comida", "odio", "trabajo", "amor", "objetivo"]


}
