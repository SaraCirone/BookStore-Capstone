import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthappService } from 'src/services/authapp.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.scss']
})
export class NavComponent implements OnInit {

  constructor(private router: Router, public BasicAuth: AuthappService) { }

  ngOnInit(): void {
  }

  onButtonClick() {
    this.router.navigate(['/login']);
  }

}
