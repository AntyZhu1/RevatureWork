import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.css']
})
export class CounterComponent implements OnInit {

  counter = 0;

  constructor() { }

  @Input()
  childData = '';

  @Output()
  childEvent = new EventEmitter();

  ngOnInit(): void {
  }

  countUp() {
    this.childEvent.emit(this.counter += 1)
  }

  countDown() {
    this.childEvent.emit(this.counter -= 1)
  }

}
