import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  productList: Product[] = [];
  productByName: Product[] = [];


    constructor(private productService: ProductService )
    {


    }


    getAllProducts(){

          this.productService.getAll()
                   .subscribe(  
                          (products) =>
                             { 
                                this.productList = products 
                                console.log(products);
                          
                            }
                                );


    }

    getByName(name:string){
      this.productService.getByName(name).subscribe((prod) => {
        this.productByName = prod;
        console.log(prod);
      })
    }




    deleteById(id:number){

        this.productService.deleteProductById(id);

    }
}
