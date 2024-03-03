import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private _http:HttpClient) { 

  }

  baseURL = 'http://localhost:3000/products/';
  getAll(): Observable<Product[]>{
    return this._http.get<Product[]>(this.baseURL);
  }

  getByName(name:string): Observable<Product[]>{
    return this._http.get<Product[]>(this.baseURL+name);
  }
 

  insertProduct(product:Product){
      this._http.post<Product>(this.baseURL,product)
      .subscribe((response) => { console.log('product added', response)})
  }

  updateProduct(product:Product){
    this._http.put<Product>(this.baseURL,product)
    .subscribe((response) => { console.log('product updated', response)})
}

// updateProduct(product: Product): Observable<Product> {
//   const url = `${this.baseURL}/${product.id}`;
//   return this._http.put<Product>(url, product);
  
// }

  


  deleteProductById(id:number){
    this._http.delete<Product>(this.baseURL+id)
    .subscribe((data) => {console.log(data)});
  }
}
