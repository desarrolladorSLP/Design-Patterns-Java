package devslp.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<>();
    private String name;
    private double salary;
    private String position;

    public Manager() {
    }

    public Manager(String name, String position, double salary) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public int size() {
        return employeeList.size();
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public Employee getChild(int i) {
        return employeeList.get(i);
    }

    public int getSubCount() {
        return getSubCount(employeeList);
    }

    public int getSubCount(List<Employee> employees) {
        int size = 0;
        for (Employee employee : employees) {
            if (employee.getClass().equals(Manager.class))
                size += ((Manager) employee).getSubCount() + 1;
            else
                size += 1;
        }
        return size;
    }

    @Override
    public double totalDivisionSalary() {
        double total = 0;
        for (Employee employee : employeeList) {
            total += employee.totalDivisionSalary();
        }
        return total + salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
