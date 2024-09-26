import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { Admin } from '../admin';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {
  admin : Admin;
  result : string;
  isValid : boolean;
  adminFound : Admin;
  constructor(private _loginService : LoginService,
    private _router : Router
  ) {
    this.admin = new Admin();
    this.isValid = false;
  }
  

  login(loginForm : NgForm) {
   if (loginForm.invalid) {
    return;
   }
  
   this.isValid = true;
 
   
      this._loginService.validate(this.admin.Username, this.admin.Password).subscribe(x => {
        alert(x);
        this.result = x;
        this._router.navigate(["dashBoard"])
      })

      // alert(this.result);
    
  }

}
