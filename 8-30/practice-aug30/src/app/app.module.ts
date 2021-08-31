import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

import { TitlePipe } from './title.pipe';
import { EmpTitlePipe } from './emp-title.pipe';
import { TestComponent } from './test/test.component';
import { CounterComponent } from './counter/counter.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    TitlePipe,
    EmpTitlePipe,
    TestComponent,
    CounterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
