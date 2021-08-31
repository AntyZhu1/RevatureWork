import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  public posts: any[] = [];

  constructor(private dataService: DataService) {
     this.dataService.getPosts().subscribe(data => this.posts = data)

   }

  ngOnInit(): void {
  }

}
