
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar.component';
import { BuscarOrdenComponent } from './buscar-orden/buscar-orden.component';
import { FormOrdenComponent } from './form-orden/form-orden.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BuscarOrdenComponent,
    FormOrdenComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
