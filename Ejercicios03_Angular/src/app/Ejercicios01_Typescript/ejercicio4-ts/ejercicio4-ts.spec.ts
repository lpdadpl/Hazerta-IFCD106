import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio4Ts } from './ejercicio4-ts';

describe('Ejercicio4Ts', () => {
  let component: Ejercicio4Ts;
  let fixture: ComponentFixture<Ejercicio4Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio4Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio4Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
