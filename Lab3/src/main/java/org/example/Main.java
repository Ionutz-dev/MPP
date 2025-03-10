package org.example;

import org.example.database.DatabaseInitializer;
import org.example.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        DatabaseInitializer.createTable();
        DatabaseInitializer.resetTable();

        // Insert records
        UserRepository.insertUser("Alice", "alice@example.com");
        UserRepository.insertUser("Bob", "bob@example.com");

        // Modify a record
        UserRepository.updateUser(1, "alice@newdomain.com");

        // Print all users
        System.out.println("\nAll users in the database:");
        UserRepository.printUsers();
    }
}
