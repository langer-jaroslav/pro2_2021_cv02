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

        for (PizzaMenuItem item : menu.getItems()) {
            System.out.println(item);
        }

    }

}
