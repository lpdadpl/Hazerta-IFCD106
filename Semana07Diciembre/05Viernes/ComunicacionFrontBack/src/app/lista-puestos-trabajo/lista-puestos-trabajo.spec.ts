import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaPuestosTrabajo } from './lista-puestos-trabajo';

describe('ListaPuestosTrabajo', () => {
  let component: ListaPuestosTrabajo;
  let fixture: ComponentFixture<ListaPuestosTrabajo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaPuestosTrabajo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaPuestosTrabajo);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
