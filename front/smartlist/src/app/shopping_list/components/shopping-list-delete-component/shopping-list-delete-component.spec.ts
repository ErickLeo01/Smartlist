import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ShoppingListDeleteComponent } from './shopping-list-delete-component';

describe('ShoppingListDeleteComponent', () => {
  let component: ShoppingListDeleteComponent;
  let fixture: ComponentFixture<ShoppingListDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShoppingListDeleteComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(ShoppingListDeleteComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
