package com.example.Java9to18.java15.SealedClass;

public sealed class Employee permits Teachers, Students {

    //Permitted class needs to extend sealed class
    //Every permitted class should be final,sealed or non-sealed modifiers
    //We can perform same rule on sealed interface/class

    Employee(){

    }
    public Object getDepartment(){
        record Department(String name){

        }
        return new Department("Computer");
    }
}
