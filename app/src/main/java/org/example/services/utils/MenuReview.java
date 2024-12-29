package org.example.services.utils;

import org.example.controllers.menu.MenuController;

import java.util.Map;

public class MenuReview {
    public static IValidatorScanner validatorScanner;

    public MenuReview(IValidatorScanner validatorScanner) {
        this.validatorScanner = validatorScanner;
    }

    public void showMenu() {

        MenuController menuController = new MenuController(validatorScanner);
        Map<Integer, Runnable> menuActions = Map.of(
                1, menuController::addDishFood,
                2, menuController::removeDishFood,
                3, menuController::ShowDishFood,
                4, () -> System.out.println("Volviendo al menú principal...")
        );
        int option;
        do {
            System.out.println("\n===== Gestión de Menús =====");
            System.out.println("1. Añadir Review a Restaurante");
            System.out.println("2. Añadir Review a Plato");
            System.out.println("3. Listar Reviews por Restaurant");
            System.out.println("4. Listar Reviews por plato");
            System.out.println("5. Volver al Menú Principal");

            option = validatorScanner.integerScanner("Selecciona una opción:");
            Runnable action = menuActions.get(option);
            if (action != null) {
                action.run();
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (option != 4);

    }
}