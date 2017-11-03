import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gerente',
  templateUrl: './gerente.component.html',
  styleUrls: ['./gerente.component.scss']
})
export class GerenteComponent implements OnInit {

   constructor(public router: Router) { }

    ngOnInit() {
        if (this.router.url === '/gerente') {
            this.router.navigate(['/not-found']);
        }
    }

}
