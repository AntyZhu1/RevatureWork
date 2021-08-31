import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }

  // @Input()
  // childData = '';

  // @Output()
  // childEvent = new EventEmitter();

  ngOnInit(): void {
  }

  // onButtonClick() {
  //   this.childEvent.emit('hi from child component')
  // }

}
