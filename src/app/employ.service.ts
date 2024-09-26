import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private _http : HttpClient) { }

  login(user : string, pwd : string) : Observable<any> {
    return this._http.get("http://localhost:8185/api/login/"+user+"/"+pwd);
  }

  showEmploy() : Observable<any> {
    return this._http.get("http://localhost:8185/api/showAllEmploy")
  }

  searchEmploy(eno :number) : Observable<any> {
    return this._http.get("http://localhost:8185/api/searchEmploy/"+eno)
  }

  deleteEmploy(id : number) : Observable<any> {
    return this._http.delete("http://localhost:8185/api/deleteEmploy/"+id);
  }
  addEmploy(employ : Employ) : Observable<any> {
    return this._http.post("http://localhost:8185/api/addEmploy",employ);
  }

  updateEmploy(employ : Employ) : Observable<any> {
    return this._http.put("http://localhost:8185/api/updateEmploy",employ);
  }


}
