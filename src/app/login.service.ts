import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private _httpClient : HttpClient) { }

  validate(user : string, pwd : string) : Observable<any> {
    return this._httpClient.get("http://localhost:8185/api/login/"+user+"/"+pwd);
  }

  
}
