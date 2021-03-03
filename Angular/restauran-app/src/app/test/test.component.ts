import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  @Input('parentData') public name: any;

  @Output() public childEvent = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }
  onClickChild() {
    this.childEvent.emit('Hey Mukesh');
  }

}
