package sweety;

import java.util.Scanner;

public class pizza {  // 'pizza' matches the filename 'pizza.java'
    protected int price;
    private boolean veg;
    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 200;
    protected int backPackPrice = 40;
    
    protected int basePizzaPrice;
    
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;
    
    Scanner in = new Scanner(System.in);
    
    public pizza(boolean veg) {  // Constructor should match the class name
        this.veg = veg;
        if (this.veg) {
            this.price = 400;
        } else {
            this.price = 500;
        }
        basePizzaPrice = this.price;
    }
    
    public void addExtraCheese() {
        System.out.println("Extra Cheese (y/n) ? ==> ");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        }
    }
    
    public void addExtraToppings() {
        System.out.println("Want Extra Topping (y/n) ? ==> ");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        }
    }

    public void takeAway() {
        System.out.println("Want Take/Away (y/n) ? ==> ");
        char ch = Character.toLowerCase(in.next().charAt(0));
        if (ch == 'y') {
            isOptedForTakeaway = true;
            this.price += backPackPrice;
        }
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza : " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings : " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeaway) {
            bill += "Take away : " + backPackPrice + "\n";
        }
        bill += "\nTotal Amount : " + this.price + "\n";
        System.out.println(bill);
        System.out.println("\n\nThank you! Visit Again...");
        System.out.println("--------------------------------------------------------------------");
    }
}
