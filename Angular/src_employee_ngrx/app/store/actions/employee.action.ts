import { createAction , props} from "@ngrx/store";
import { Employee } from "src/app/model/employee.model";


export const addEmployeeAction = createAction(
    '[Employees] Add Employee',
    props<{ employee: Employee }>()
)


export const removeEmployeeAction = createAction(
    '[Employees] Remove Employee',
    props<{ id: string }>()
)



export const updateEmployeeAction = createAction(
  '[Employees] Update Employee',
  props<{ id: string, employee: Employee }>()
);
