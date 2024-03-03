import { Employee } from "src/app/model/employee.model";
import { createReducer,on } from "@ngrx/store";
import { addEmployeeAction,removeEmployeeAction, updateEmployeeAction } from "../actions/employee.action";

export interface EmployeeState{
    employees:Employee[];

}

export const initialState: EmployeeState = {
employees:[

]
}

export const EmployeesReducer = createReducer(

    initialState,
    on(addEmployeeAction,(state,{employee})=>({

      ...state,
        employees:[...state.employees,employee]
    })),
    on(removeEmployeeAction,(state,{id})=>({

        ...state,
        employees:state.employees.filter( (employee) => { return employee.id !== id})
      
        
      })),
      on(updateEmployeeAction, (state, { id, employee }) => ({
        ...state,
        employees: state.employees.map((emp) => (emp.id === id ? employee : emp))
      }))
);