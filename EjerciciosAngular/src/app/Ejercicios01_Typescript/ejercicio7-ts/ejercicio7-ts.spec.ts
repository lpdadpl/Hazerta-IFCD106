import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio7Ts } from './ejercicio7-ts';

describe('Ejercicio7Ts', () => {
  let component: Ejercicio7Ts;
  let fixture: ComponentFixture<Ejercicio7Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio7Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio7Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
