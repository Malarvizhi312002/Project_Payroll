import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployLoginComponent } from './employ-login.component';

describe('EmployLoginComponent', () => {
  let component: EmployLoginComponent;
  let fixture: ComponentFixture<EmployLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployLoginComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
