/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;


import org.example.services.utils.IValidatorScanner;
import org.example.services.utils.MenuMain;
import org.example.services.utils.MenuRestaurant;
import org.example.services.utils.ValidatorScanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        IValidatorScanner scanner = new ValidatorScanner();
        MenuMain main= new MenuMain(scanner);
        main.showMenu();
    }
}
