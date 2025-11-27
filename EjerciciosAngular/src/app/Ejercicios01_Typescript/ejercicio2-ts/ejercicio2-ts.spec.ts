import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio2Ts } from './ejercicio2-ts';

describe('Ejercicio2Ts', () => {
  let component: Ejercicio2Ts;
  let fixture: ComponentFixture<Ejercicio2Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio2Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio2Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
