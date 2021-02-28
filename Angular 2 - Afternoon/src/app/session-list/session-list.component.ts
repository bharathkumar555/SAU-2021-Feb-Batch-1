import { Component, OnInit } from '@angular/core';
import { SessionDetails } from '../serviceInterface/sessionDetails';
import { SessionService } from '../session.service';
import { AddSessionComponent } from '../add-session/add-session.component';
import { UpdateSessionComponent } from '../update-session/update-session.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-session-list',
  templateUrl: './session-list.component.html',
  styleUrls: ['./session-list.component.scss'],
})
export class SessionListComponent implements OnInit {
  selectedSession: SessionDetails;
  sessions: SessionDetails[] = [];

  constructor(
    private sessionService: SessionService,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.sessions = this.sessionService.getSessions();
  }

  updateSelected(session: SessionDetails) {
    console.log(session);
    this.selectedSession = session;
  }

  addSession() {
    this.dialog.open(AddSessionComponent);
  }

  deleteSession(session: SessionDetails) {
    this.sessionService.deleteSession(session);
  }

  editSession(session: SessionDetails) {
    this.dialog.open(UpdateSessionComponent, {
      data: {
        session: session,
      },
    });
  }
}
