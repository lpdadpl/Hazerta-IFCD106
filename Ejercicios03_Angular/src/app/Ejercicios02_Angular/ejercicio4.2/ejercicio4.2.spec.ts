import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejercicio42 } from './ejercicio4.2';

describe('Ejercicio42', () => {
  let component: Ejercicio42;
  let fixture: ComponentFixture<Ejercicio42>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ejercicio42]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejercicio42);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
