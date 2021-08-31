import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-toggle',
  templateUrl: './toggle.component.html',
  styleUrls: ['./toggle.component.css']
})
export class ToggleComponent implements OnInit {

  public items: any[] = [];

  isShow = false;

  constructor() { 
    this.items = [
      { id: 1, name: 'orange', category: 'produce', price: '$0.25' },
      { id: 2, name: 'apple', category: 'produce', price: '$0.20' },
      { id: 3, name: 'pear', category: 'produce', price: '$0.35' },
      { id: 4, name: 'tuna', category: 'seafood', price: '$1.13' },
      { id: 5, name: 'potato chips', category: 'processed foods', price: '$4.99' },
      { id: 6, name: 'soap', category: 'cleaning', price: '$5.99' },

    ]
  }

  toggleDisplay() {
    this.isShow = !this.isShow;
  }

  trackyById(item: any){
    return item.id;
  }

  ngOnInit(): void {
  }

}
