package com.company;

public class EmployeePrinter implements Printer{

    @Override
    public void print(Employee employee) {
        System.out.println(employee.firstName + ' ' + employee.lastName);
    }
}
