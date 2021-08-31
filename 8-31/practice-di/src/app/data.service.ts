import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getItems() {
    return [
      
      {id: 1, name: "apple", category: "fruit", price: .21},
      {id: 2, name: "orange", category: "fruit", price: .42},
      {id: 3, name: "cabbage", category: "vegetable", price: 1.11},
      {id: 4, name: "chips", category: "processed foods", price: 3.21}

    ]
  
  }
}
