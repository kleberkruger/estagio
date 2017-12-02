import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoGridColumnSpanComponent } from './demo-grid-column-span.component';

describe('DemoGridColumnSpanComponent', () => {
  let component: DemoGridColumnSpanComponent;
  let fixture: ComponentFixture<DemoGridColumnSpanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DemoGridColumnSpanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoGridColumnSpanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
