import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  childDataReceived = '';

  parentData:string= 'Hi This is Parent Data';

  getChildData(data:any){
    console.log(data);
    this.childDataReceived = data;
  }
}
