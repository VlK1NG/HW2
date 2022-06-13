package com.company;

public class Main {

    public static void main(String[] args) {

        EmployeePrinter employeePrinter = new EmployeePrinter();
        EmployeeSalaryPrinter employeeSalaryPrinter = new EmployeeSalaryPrinter();

        Employee employee = new Employee("John", "Doe", 24, "AQA", 25000);

        employeePrinter.print(employee);
        employeeSalaryPrinter.print(employee);

        Employee employee1 = new Employee("", "", 17, "AQA", -5000);
        employeePrinter.print(employee1);
        employeeSalaryPrinter.print(employee1);
    }
}
