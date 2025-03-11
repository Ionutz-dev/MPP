package org.example;

import org.example.database.DatabaseInitializer;
import org.example.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        DatabaseInitializer.createTable();
        DatabaseInitializer.resetTable();

        UserRepository.insertUser("Dorian", "dorian@popa.com");
        UserRepository.insertUser("Michael", "michael@jordan.com");
        UserRepository.insertUser("Tzanca", "tzanca@uraganu.com");

        UserRepository.updateUser(1, "dorian@hatz.com");

        System.out.println("\nAll users in the database:");
        UserRepository.printUsers();
    }
}
