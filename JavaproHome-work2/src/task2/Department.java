package task2;

public class Department extends Organization {
    private String deparmentName;
    private float deparmendId;

    public Department(String organizationName, String deparmentName, float deparmendId) {
        super(organizationName);
        this.deparmentName = deparmentName;
        this.deparmendId = deparmendId;
    }



    public String getDeparmentName() {
        return deparmentName;
    }

    public float getDeparmendId() {
        return deparmendId;
    }
}
