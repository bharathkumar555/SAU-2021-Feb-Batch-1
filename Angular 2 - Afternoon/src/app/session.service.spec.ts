import { TestBed } from '@angular/core/testing';

import { sessionService } from './session.service';

describe('sessionService', () => {
  let service: sessionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(sessionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
