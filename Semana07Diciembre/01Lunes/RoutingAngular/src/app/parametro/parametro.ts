import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-parametro',
  imports: [RouterModule],
  templateUrl: './parametro.html',
  styleUrl: './parametro.css',
})
export class Parametro {
  Id: number = 0;

  constructor(private route: ActivatedRoute, private rutas: Router){}

  ngOnInit(): void{
    const param = this.route.snapshot.paramMap.get('id');
  
    if (param){
      this.Id = Number(param);
    }

    console.log('Parametro recibido', this.Id)
  }

  navegarParametro(){
    this.rutas.navigate(['/hacia']);
  }

  volverHome(){
    this.rutas.navigate(['/desde'])
  }
}