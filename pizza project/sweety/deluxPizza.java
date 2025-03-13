package sweety;

public class deluxPizza extends pizza {  // 'DeluxPizza' matches 'DeluxPizza.java'
    public deluxPizza(boolean veg) {
        super(veg);
    }

    @Override
    public void addExtraCheese() {
        super.addExtraCheese();  // Calls parent class method
    }

    @Override
    public void addExtraToppings() {
        super.addExtraToppings();  // Calls parent class method
    }
}
