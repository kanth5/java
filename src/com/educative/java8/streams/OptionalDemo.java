package com.educative.java8.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {

    Map<Integer, Employee> empMap = new HashMap<>();

    public Optional<Employee> getEmployee(Integer employeeId) {

        // If while creating the Optional, you are not sure if the value is null or not null, then use the ofNullable() method.
        // If a non-null value is passed in Optional.ofNullable(), then it will return the Optional, containing the specified
        // value. Otherwise, it will return an empty Optional.

        // Before returning the employee object we are wrapping it into an Optional
        return Optional.ofNullable(empMap.get(employeeId));
    }

    public static void main(String[] args) {
        OptionalDemo demo = new OptionalDemo();
        Optional<Employee> emp = demo.getEmployee(123);
        // Before getting a value from Optional we check if the value is present through isPresent() method.
        if (emp.isPresent()) {
            System.out.println(emp.get().getName());  // We use get() method to get the value from Optional.
        } else {
            System.out.println("No employee returned.");
        }

        // The optional created through empty() will contain a null value.

        Optional<Employee> emp1 = Optional.empty();

        System.out.println(emp1.isEmpty());

        // We can create an Optional object that has a non-null value using of() method.
        // If we create an Optional using the of() method and the value is null, then it will throw a Null Pointer Exception.

        Employee e = new Employee("Kanth");
        Optional<Employee> emp2 = Optional.of(e);

        System.out.println(emp2.isEmpty() + " " + emp2.isPresent());
    }
}