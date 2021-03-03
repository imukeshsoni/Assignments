import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentDetailsService {

  constructor() {

  }
  public getStudentDetails() {
    return [
      { "id": 1, "name": "Mukesh", "age": 22 },
      { "id": 2, "name": "Vicky", "age": 21 },
      { "id": 2, "name": "Vishal", "age": 23 },
      { "id": 2, "name": "Rajit", "age": 24 },
      { "id": 2, "name": "Shubham", "age": 20 },
    ];
  }
}
