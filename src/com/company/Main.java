package com.company;

public class Main{

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "John";
        employee.lastName = "Doe";

        Employee employee1 = new Employee();
        employee1.firstName = "Mary";
        employee1.lastName = "Jane";

        EmployeePrinter employeePrinter = new EmployeePrinter();
        employeePrinter.print(employee);
        employeePrinter.print(employee1);
    }
}
