import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-back-home',
  imports: [],
  templateUrl: './back-home.html',
  styleUrl: './back-home.css',
})
export class BackHome {

  constructor(public router:Router){}

  volverHome(){
    this.router.navigate(['home-ex1'])
  }
}
