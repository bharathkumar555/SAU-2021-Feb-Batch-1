import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddSessionComponent } from '../add-session/add-session.component';
import { SessionListComponent } from '../session-list/session-list.component';

const appRouts : Routes = [
  
  {
    path:'add',
    component:AddSessionComponent,
  },
  {
    path:'',
    component:SessionListComponent,
  }
  
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(appRouts)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
