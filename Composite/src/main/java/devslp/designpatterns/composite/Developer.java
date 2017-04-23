package devslp.designpatterns.composite;

// Leaf / Child
public class Developer implements Employee {

    private String name;
    private String position;
    private double salary;

    public Developer() {

    }

    public Developer(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
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

    @Override
    public double totalDivisionSalary() {
        return salary;
    }

}
