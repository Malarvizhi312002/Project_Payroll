import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { EmployInsertComponent } from './employ-insert/employ-insert.component';
import { EmployDeleteComponent } from './employ-delete/employ-delete.component';
import { EmployUpdateComponent } from './employ-update/employ-update.component';
import { EmployDashBoardComponent } from './employ-dash-board/employ-dash-board.component';
import { RouterModule, Routes } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { EmployLoginComponent } from './employ-login/employ-login.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';

const routes: Routes = [
  { path: '', component: MenuComponent },
  { path: 'adminlogin', component: AdminLoginComponent },
  { path: 'employlogin', component: EmployLoginComponent },
  { 
    path: 'dashBoard', 
    component: AdminDashboardComponent,
    children: [
      { path: 'employshow', component: EmployShowComponent, outlet: 'hexa' },
      { path: 'employsearch', component: EmploySearchComponent, outlet: 'hexa' },
      { path: 'addemploy', component: EmployInsertComponent, outlet: 'hexa' },
      { path: 'deleteemploy', component: EmployDeleteComponent, outlet: 'hexa' },
      { path: 'updateemploy', component: EmployUpdateComponent, outlet: 'hexa' }
    ]
  },
  { path: 'empdashboard', component: EmployDashBoardComponent, 
    children: [
      { path: 'updateemploy', component: EmployUpdateComponent, outlet: 'hex' }
    ]
  }
];

@NgModule({
  declarations: [
    AppComponent,
    EmployShowComponent,
    EmploySearchComponent,
    AdminLoginComponent,
    EmployInsertComponent,
    EmployDeleteComponent,
    EmployUpdateComponent,
    EmployDashBoardComponent,
    MenuComponent,
    EmployLoginComponent,
    AdminDashboardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
