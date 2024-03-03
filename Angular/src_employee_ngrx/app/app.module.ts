import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { FormsModule } from '@angular/forms';
import { StoreModule } from '@ngrx/store';
import { EmployeesReducer } from './store/reducers/employee.reducer';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    StoreModule.forRoot({employees:EmployeesReducer})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
