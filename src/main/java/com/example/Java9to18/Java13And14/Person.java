package com.example.Java9to18.Java13And14;

public record Person(int id, String name) {
    //Use case -> concise way to create immutable classes for data-carrying purposes.
    //All the fields in record are final
    //preview feature in java 14 -> Introduced in java 16
    //we can not override automatic generated methods

    // records implicitly extend the java.lang.Record class, and you cannot extend any other class.
    // You can implement multiple interfaces.
}
