import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employ-login',
  templateUrl: './employ-login.component.html',
  styleUrl: './employ-login.component.css'
})
export class EmployLoginComponent {
  employ : Employ;
  result : string;
  isValid : boolean;
  employFound : Employ;
  constructor(private _loginService : EmployService,
    private _router : Router
  ) {
    this.employ = new Employ();
    this.isValid = false;
  }
  

  login(loginForm : NgForm) {
   if (loginForm.invalid) {
    return;
   }
  
   this.isValid = true;
 
   
      this._loginService.validate(this.employ.username, this.employ.password).subscribe(x => {
        alert(x);
        this.result = x;
        this._router.navigate(["empdashboard"])
      })

      // alert(this.result);
    
  }

}
