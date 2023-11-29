package com.interview.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMethodsDemo {

    Map<Integer, Employee> empMap = new HashMap<>();

    public void populateEmployee() {
        empMap.put(123, new Employee("Alex", 23, 12000));
    }

    public Optional<Employee> getEmployee(Integer employeeId) {
        // Before returning the employee object we are wrapping it into an Optional
        return Optional.ofNullable(empMap.get(employeeId));
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Test");

        Optional<Employee> optional1 = Optional.of(e1);

        if (optional1.isPresent()) {
            System.out.println(optional1.get().getName());
        }

        OptionalMethodsDemo demo = new OptionalMethodsDemo();
        demo.populateEmployee();
        Optional<Employee> emp = demo.getEmployee(123);
        emp.ifPresent(System.out::println);
    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}