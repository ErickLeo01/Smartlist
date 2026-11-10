import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ShoppingListUpdateComponent } from './shopping-list-update-component';

describe('ShoppingListUpdateComponent', () => {
  let component: ShoppingListUpdateComponent;
  let fixture: ComponentFixture<ShoppingListUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShoppingListUpdateComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(ShoppingListUpdateComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
