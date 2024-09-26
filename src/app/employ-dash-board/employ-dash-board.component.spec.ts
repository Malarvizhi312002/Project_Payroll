import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployDashBoardComponent } from './employ-dash-board.component';

describe('EmployDashBoardComponent', () => {
  let component: EmployDashBoardComponent;
  let fixture: ComponentFixture<EmployDashBoardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployDashBoardComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployDashBoardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
