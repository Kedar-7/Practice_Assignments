import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';


  registerForm!: FormGroup;

  submitted = false;


constructor(private formBuilder: FormBuilder){


}

    
ngOnInit() {

        this.registerForm = this.formBuilder.group({

      name:['',[Validators.required , Validators.minLength(5)] ],
        email:['',[Validators.required,Validators.email]],
      password:['',[Validators.required,Validators.minLength(5),Validators.maxLength(10)]],
      
      gender:['',[Validators.required,Validators.minLength(3)] ],
      contact:['',[Validators.required , Validators.minLength(5)] ],
      address:['',[Validators.required , Validators.minLength(5)] ]

        });

}


// f is a getter function which returns form controls 

get f(){

    return this.registerForm.controls;

}

  onSubmit(){

      this.submitted = true;

    if(this.registerForm.invalid){

        return;

    }
   else{
    alert('Form submission successful ');
    console.log(this.f['name'].value);

   }

  }
}
