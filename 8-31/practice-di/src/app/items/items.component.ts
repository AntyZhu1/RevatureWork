import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  items: any[] = [];

  constructor(private dataService: DataService) {
    
    this.items = dataService.getItems();

  }

  ngOnInit(): void {
  }

}
