import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio5Ts } from './ejercicio5-ts';

describe('Ejercicio5Ts', () => {
  let component: Ejercicio5Ts;
  let fixture: ComponentFixture<Ejercicio5Ts>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio5Ts]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio5Ts);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
