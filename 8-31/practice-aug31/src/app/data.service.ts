import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  

  constructor() { }

  getEmployees() {
    return [
      {id: 1, name: "John", gender: "M", email: "johnd@email.com"},
      {id: 2, name: "Jane", gender: "F", email: "johnd@email.com"},
      {id: 3, name: "Chris", gender: "M", email: "chrisr@email.com"},
      {id: 4, name: "Claire", gender: "F", email: "clairer@email.com"},
      {id: 5, name: "Leon", gender: "M", email: "leonk@email.com"},
      {id: 6, name: "Ashley", gender: "F", email: "ashley@email.com"}
    ]
  
  }
}
