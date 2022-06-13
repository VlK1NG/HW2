package com.company;

public class Main {

    public static void main(String[] args) {

        EmployeePrinter employeePrinter = new EmployeePrinter();
        EmployeeSalaryPrinter employeeSalaryPrinter = new EmployeeSalaryPrinter();

        //simple object creating
        Employee employee2 = new Employee("Ivan", "Popov", 25, "AQA", POSITION.SENIOR);
        employeePrinter.print(employee2);
        employeeSalaryPrinter.print(employee2);

        //array object creating
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Sasha", "Petrov", 36,
                "AQA", POSITION.MIDDLE);
        employees[1] = new Employee("Max", "Verstappen", 24,
                "JS Developer", POSITION.SENIOR);
        employees[2] = new Employee("John", "Doe", 24,
                "AQA", 25000, POSITION.JUNIOR);
        employees[3] = new Employee("", "", 17,
                "AQA", -50000, POSITION.MIDDLE);

        //loop objects output
        for (Employee employee : employees) {
            employeePrinter.print(employee);
            employeeSalaryPrinter.print(employee);
        }

    }
}
