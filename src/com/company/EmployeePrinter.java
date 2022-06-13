package com.company;

public class EmployeePrinter implements Printer {

    @Override
    public void print(Employee employee) {

        if (employee.firstName.isEmpty() || employee.lastName.isEmpty()) {
            System.out.println("\nF&L name can't be empty.");
        } else {
            System.out.println("\n" + employee.firstName + ' ' + employee.lastName);
        }

        if (employee.age < 0) {
            System.out.println("Incorrect age value.");
        } else if (employee.age < 18) {
            System.out.println("Too young");
        } else System.out.println("Age: " + employee.age);
    }
}
