import { Component } from '@angular/core';
import { Employee } from '../model/employee.model';
import { Store } from '@ngrx/store';
import { addEmployeeAction, removeEmployeeAction, updateEmployeeAction } from '../store/actions/employee.action';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  employeeid!: string;
  employeeName!: string;
  employeeEmail!:string;
  employeesList!: Employee[];
  showList: boolean = false;

  updatedEmployeeId: string = '';
  updatedEmployeeName: string = '';
  updatedEmployeeEmail: string = '';

  constructor(private store:Store<{employees:{employees:Employee[]}}>){
    store.select('employees').subscribe((employeesState:{employees:Employee[]}) => {
      this.employeesList = employeesState.employees;
      console.log(this.employeesList);
    })
  }

  addEmployee(){
    const employee: Employee = {
      id: this.employeeid,
      name: this.employeeName,
      email: this.employeeEmail,
    }

    this.store.dispatch(addEmployeeAction({employee}));
    this.employeeid='';
    this.employeeEmail='';
    this.employeeName='';
}
removeEmployee(id:string){

  this.store.dispatch(removeEmployeeAction({id}));

}

toggleList() {
  this.showList = !this.showList;
}


updateEmployee() {

  const updatedEmployee: Employee = {
    id: this.employeeid,
    name: this.updatedEmployeeName,
    email: this.updatedEmployeeEmail
  };

  
  this.store.dispatch(updateEmployeeAction({ id: this.updatedEmployeeId, employee: updatedEmployee }));

  
  this.employeeid = '';
  this.updatedEmployeeName = '';
  this.updatedEmployeeEmail = '';
}
}





