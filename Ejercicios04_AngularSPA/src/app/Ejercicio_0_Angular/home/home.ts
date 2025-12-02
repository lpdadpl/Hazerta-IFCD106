import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { Header } from '../header/header';
import { AllBackButton } from '../../all-back-button/all-back-button';

@Component({
  selector: 'app-home',
  imports: [RouterModule, Header, AllBackButton],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {

}