package com.company;

public class EmployeeSalaryPrinter implements Printer {

    @Override
    public void print(Employee employee) {

        if (employee.salary < 0) {
            System.out.println("Incorrect salary value.");
//        } else if (employee.salary == 0){employee.salary=employee.position.minSalary;
//            switch (position) {
//                case JUNIOR:
//                    salary = 5000;
//                    break;
//                case MIDDLE:
//                    salary = 10000;
//                    break;
//                case SENIOR:
//                    salary = 20000;
//                    break;
//                default:
//                    salary = -10000;
//            }
//        }
        } else
            System.out.println("Salary: " + employee.salary);
    }
}
