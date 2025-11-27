import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio9Ts } from './ejercicio9-ts';

describe('Ejercicio9Ts', () => {
  let component: Ejercicio9Ts;
  let fixture: ComponentFixture<Ejercicio9Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio9Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio9Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
