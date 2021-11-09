package org.example.hospital;

public class Hospital {

    private final Employee[] employees;

    public Hospital(int size) {
        this.employees = new Employee[size];
    }

    public void addEmployee(Employee employee) throws TooManyEmployeesException {

        int index = 0;
        Employee actualEmployee = null;

        do {
            actualEmployee = employees[index];

            if (actualEmployee == null) {
                employees[index] = employee;
                break;
            }

            index++;
            if (index >= employees.length) {
                throw new TooManyEmployeesException("!!attention!!! Too many employees. Make com.example.hospital bigger");
            }
        } while(actualEmployee != null);

        System.out.println(employee.introduce());
    }
}
