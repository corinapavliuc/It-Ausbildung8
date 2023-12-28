package task2;

public class Employee extends Department{
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    public Employee(String organizationName,
                    String deparmentName,
                    float deparmendId,
                    String firstName,
                    String lastName,
                    int employeeID,
                    double salary) {
        super(organizationName, deparmentName, deparmendId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
