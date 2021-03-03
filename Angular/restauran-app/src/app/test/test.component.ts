import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { StudentDetailsService } from 'src/app/student-details.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public students: any;

  constructor(private _studentDetails: StudentDetailsService) {
    this.students = this._studentDetails.getStudentDetails();
  }

  ngOnInit(): void {
  }


}
