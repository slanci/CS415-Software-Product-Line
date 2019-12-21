import java.util.Date;

public class Intern {

    private int ID;
    private Employee employee;
    private String location;
    private Date duration;
    private String department;
    private String team;

    public Intern(int ID, Employee employee, String location, Date duration, String department, String team) {
        this.ID = ID;
        this.employee = employee;
        this.location = location;
        this.duration = duration;
        this.department = department;
        this.team = team;
    }
}