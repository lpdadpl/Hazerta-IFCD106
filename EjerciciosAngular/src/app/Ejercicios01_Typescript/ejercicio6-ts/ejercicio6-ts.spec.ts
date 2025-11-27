import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio6Ts } from './ejercicio6-ts';

describe('Ejercicio6Ts', () => {
  let component: Ejercicio6Ts;
  let fixture: ComponentFixture<Ejercicio6Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio6Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio6Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
