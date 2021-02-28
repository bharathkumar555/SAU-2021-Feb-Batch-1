import { Injectable } from '@angular/core';
import { SessionDetails } from './serviceInterface/sessionDetails';

@Injectable({
  providedIn: 'root',
})
export class SessionService {
  sessions: SessionDetails[] = [
    {
      name: 'Kafka',
      instructor: 'Akash Maharana',
      description: 'Event Streaming - Producers, Consumers, Brokers, Topic',
    },
    {
      name: 'Kafka',
      instructor: 'Akash Maharana',
      description: 'Event Streaming - Producers, Consumers, Brokers, Topic',
    },
    {
      name: 'Design Principles and Patterns',
      instructor: 'Nishant Saurabh',
      description:
        'Design principle, DRY, SOLID, Yagni, Factory, Adapter, Singleton',
    },
    {
      name: 'Spring core',
      instructor: 'RoshaniNihar Mehata',
      description:
        'Dependency Injection, Aspect Oriented Programming, BeanFactory',
    },
  ];

  constructor() {}

  getSessions() {
    return this.sessions;
  }

  addSession(session: SessionDetails) {
    this.sessions.push(session);
  }

  deleteSession(session: SessionDetails) {
    const index = this.sessions.indexOf(session);
    this.sessions.splice(index, 1);
  }

  editSession(oldSession: SessionDetails, newSession: SessionDetails) {
    const index = this.sessions.indexOf(oldSession);
    this.sessions[index] = newSession;
  }
}
