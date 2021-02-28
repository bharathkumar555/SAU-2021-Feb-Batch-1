import { Component, OnInit, Inject } from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { SessionService } from '../session.service';
import { SessionDetails } from '../serviceInterface/sessionDetails';
import { MatDialogRef } from '@angular/material/dialog';
import { SessionListComponent } from '../session-list/session-list.component';


@Component({
  selector: 'app-update-session',
  templateUrl: './update-session.component.html',
  styleUrls: ['./update-session.component.scss']
})
export class UpdateSessionComponent implements OnInit {

  sessionForm:FormGroup;
  session : SessionDetails;
  constructor(private sessionService:SessionService,@Inject(MAT_DIALOG_DATA) public data: any,private dialogRef:MatDialogRef<SessionListComponent>) { }

  update_feilds = ["name","instructor","description"]

  ngOnInit(): void {
    console.log(this.data);
    this.session = this.data.session;
    this.sessionForm = new FormGroup({
      name : new FormControl('', Validators.required),
      instructor : new FormControl('', Validators.required),
      description : new FormControl('')
    });
    this.sessionForm.controls['name'].setValue(this.session.name);
    this.sessionForm.controls['instructor'].setValue(this.session.instructor);
    this.sessionForm.controls['description'].setValue(this.session.description);
  }

  get name() {
    return this.sessionForm.get('name') as FormControl;
  }

  get instructor() {
    return this.sessionForm.get('instructor') as FormControl;
  }

  get description() {
    return this.sessionForm.get('description') as FormControl;
  }

  editSession() {
    console.log(this.name.value)
    const newSession:SessionDetails = {
      name : this.name.value,
      instructor : this.instructor.value,
      description : this.description.value
    }
    this.sessionService.editSession(this.session,newSession);
    this.dialogRef.close();
  }

}
