import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private String surname;
	private int age;
	private int salary;
	private String address;
	private Department department;
	private HRTeam team;
	private int yearsInTheComp;
	private String gender;
	private String jobTitle;
	private String email;
	private String phone;
	private Resume resume;
	private Date[] absenceTimes;
	private Date[] overTimes;
	private Date[] paidTimeOff;
	private String[] jobHistory;
	private int[] salaryHistory;
	private String BankAccount;

	public Employee(int id, String name, String surname, int age, int salary, String address, Department department, HRTeam team, int yearsInTheComp, String gender, String jobTitle, String email, String phone, Resume resume, Date[] absenceTimes, Date[] overTimes, Date[] paidTimeOff, String[] jobHistory, int[] salaryHistory, String bankAccount) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.department = department;
		this.team = team;
		this.yearsInTheComp = yearsInTheComp;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.email = email;
		this.phone = phone;
		this.resume = resume;
		this.absenceTimes = absenceTimes;
		this.overTimes = overTimes;
		this.paidTimeOff = paidTimeOff;
		this.jobHistory = jobHistory;
		this.salaryHistory = salaryHistory;
		BankAccount = bankAccount;
	}
}