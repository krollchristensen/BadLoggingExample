package org.example;

import java.io.IOException;

public class BadLoggingExample {

    public static void main(String[] args) throws InterruptedException {

            try {
                performOperation();
            } catch (Exception e) {
                System.out.println("Noget gik galt"); // Dårlig praksis: Ingen stacktrace eller exception detaljer
            }
            System.out.println("Operation udført"); // Brug af System.out.println i stedet for en logger

    }

    private static void performOperation() throws IOException {
        // Simulerer en operation, der kan mislykkes
        if (Math.random() > 0.5) {
            System.err.println("Fejl opstået"); // Dårlig praksis: Brug af System.err til at logge fejl
            throw new IOException("Kunstig fejl genereret");
        }

        System.out.println("Operationen lykkedes"); // Endnu et eksempel på dårlig logging
    }
}
