import { Component } from '@angular/core';

@Component({
  selector: 'my-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.scss'
})
export class App {
  protected title = 'front-app';
}
