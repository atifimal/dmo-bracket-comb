import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-getresult',
  templateUrl: './getresult.component.html',
  styleUrls: ['./getresult.component.css'],
})

export class GetresultComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(): void {

  }

  getresult(n: any): void {
    var x=1;
    this.http.get<any>('http://localhost:8080/dmo_bracket_comb/api/ws/comb/' + n.combnumber).subscribe(data => {
      alert(data);
    })
  }

}
