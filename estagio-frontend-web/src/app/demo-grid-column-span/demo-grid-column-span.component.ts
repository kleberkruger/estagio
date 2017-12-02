import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-grid-column-span',
  templateUrl: './demo-grid-column-span.component.html',
  styleUrls: ['./demo-grid-column-span.component.scss']
})
export class DemoGridColumnSpanComponent implements OnInit {

  calc2Cols = '2 2 calc(10em + 10px);';
  /** 10px is the missing margin of the missing box */
  calc3Cols = '3 3 calc(15em + 20px)';
  /** 20px is the missing margin of the two missing boxes */

  constructor() { }

  ngOnInit() {
  }

}