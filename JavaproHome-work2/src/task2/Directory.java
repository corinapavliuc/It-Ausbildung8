package task2;

import java.time.LocalDate;

public class Directory  extends Employee{
   private LocalDate startOfPost;

    public Directory(String organizationName,
                     String deparmentName,
                     float deparmendId,
                     String firstName,
                     String lastName,
                     int employeeID,
                     double salary,
                     LocalDate startOfPost) {
        super(organizationName, deparmentName, deparmendId, firstName, lastName, employeeID, salary);
        this.startOfPost = startOfPost;
    }

    public LocalDate getStartOfPost() {
        return startOfPost;
    }

    public void setStartOfPost(LocalDate startOfPost) {
        this.startOfPost = startOfPost;
    }
}
