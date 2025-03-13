package sweety;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Welcome to Pizzamania---------------\n");
        System.out.println("Choose Pizza : (1. Veg Pizza  2. Non-Veg Pizza  3. Delux Veg Pizza  4. Delux Non-Veg Pizza) ===>");
        
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch (ch) {
            case 1:
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;

            case 2:
                pizza nonvegPizza = new pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
                break;

            case 3:
                deluxPizza veg = new deluxPizza(true);
                veg.basePizzaPrice = 600;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;

            case 4:
                deluxPizza nonveg = new deluxPizza(false);
                nonveg.basePizzaPrice = 700;
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeAway();
                nonveg.getBill();
                break;

            default:
                System.out.println("Sorry, please enter a valid option!");
        }
        sc.close();
    }
}
