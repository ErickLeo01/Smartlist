import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ShoppingListFindComponent } from './shopping-list-find-component';

describe('ShoppingListFindComponent', () => {
  let component: ShoppingListFindComponent;
  let fixture: ComponentFixture<ShoppingListFindComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShoppingListFindComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(ShoppingListFindComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
