import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-back-home',
  imports: [],
  templateUrl: './back-home.html',
  styleUrl: './back-home.css',
})
export class BackHome {
 
  constructor(private router:Router){}

  volverHome(){
    this.router.navigate(['/home-ex2'])
  }
}
