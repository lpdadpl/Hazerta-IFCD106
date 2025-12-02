import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BackHome } from '../back-home/back-home';

@Component({
  selector: 'app-parametro',
  imports: [BackHome],
  templateUrl: './parametro.html',
  styleUrl: './parametro.css',
})
export class Parametro {

idProducto: string | null = null;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.route.paramMap.subscribe(params => {
      this.idProducto = params.get('id');
      console.log('Parámetro de ID recibido:', this.idProducto);
    });
  }

}
