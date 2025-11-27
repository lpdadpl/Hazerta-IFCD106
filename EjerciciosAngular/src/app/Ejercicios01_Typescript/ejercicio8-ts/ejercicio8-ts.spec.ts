import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio8Ts } from './ejercicio8-ts';

describe('Ejercicio8Ts', () => {
  let component: Ejercicio8Ts;
  let fixture: ComponentFixture<Ejercicio8Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio8Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio8Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
