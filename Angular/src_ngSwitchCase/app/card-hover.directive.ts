import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appCardHover]'
})
export class CardHoverDirective {

  constructor(private el: ElementRef,private renderer: Renderer2) { 

    //renderer.setStyle(el.nativeElement, 'backgroundColor', 'green')
  }


  @HostListener('mouseover') onMouseOver(){
    //let part = this.el.nativeElement.querSelector('.card-text')

    this.renderer.setStyle(this.el.nativeElement, 'backgroundColor', 'red')

    alert('mouse is over context');
  }

}
