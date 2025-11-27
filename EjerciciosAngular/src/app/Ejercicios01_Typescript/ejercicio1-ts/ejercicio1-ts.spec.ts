import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio1Ts } from './ejercicio1-ts';

describe('Ejercicio1Ts', () => {
  let component: Ejercicio1Ts;
  let fixture: ComponentFixture<Ejercicio1Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio1Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio1Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
