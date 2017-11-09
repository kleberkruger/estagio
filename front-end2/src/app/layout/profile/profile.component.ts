import { FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  selectedOption: string;
  profile: any;

  constructor(){
    this.profile = JSON.parse(localStorage.getItem("currentUser"));

  }

  ngOnInit() {
   
  }
   
}


