package Day5;

public class Employee extends Person {
    private int employeeId;
    private double salary;
    private String title;

    public Employee() {
        super("Ahmed");
        System.out.println("I am employee default constructor");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
