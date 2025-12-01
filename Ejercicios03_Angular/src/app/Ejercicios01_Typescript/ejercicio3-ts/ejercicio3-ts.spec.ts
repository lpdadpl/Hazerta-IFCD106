import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio3Ts } from './ejercicio3-ts';

describe('Ejercicio3Ts', () => {
  let component: Ejercicio3Ts;
  let fixture: ComponentFixture<Ejercicio3Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio3Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio3Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
