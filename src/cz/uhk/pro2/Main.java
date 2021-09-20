package cz.uhk.pro2;

import cz.uhk.pro2.models.PizzaMenu;
import cz.uhk.pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PizzaMenu menu = new PizzaMenu();
        menu.addItem(new PizzaMenuItem("Hawai", "Ananas", 120));
        menu.addItem(new PizzaMenuItem("sunkova", "sunka", 150));
        System.out.println("last update: " + menu.getLastUpdate());


        PizzaMenu menu2 = menu;
        menu2.addItem(new PizzaMenuItem("Polo", "kuřecí", 150));

        for (PizzaMenuItem item : menu.getItems()) {
            System.out.println(item);
        }
        boolean b = true;
        int i = 10;
        float f = 1f;
        double d = 2d;
        int i2 = i;

        i2++;
        System.out.println(i);

        if(i == i2){
        }
        if(menu == menu2){
            System.out.println("pizza menu match");
        }
    }
}
