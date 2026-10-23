public class Teacher extends Employee{

    String subject;
    String qualification;

    public Teacher(String name, String subject, String qualification, Date dateOfOffice, Date dob, int salary) {
        super(name, dateOfOffice, salary, dob);
        this.qualification = qualification;
        this.subject = subject;

    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void getDetails() {
        System.out.println("--------- INFORMATION OF TEACHER ------------");
        System.out.println("teacher name: " + name);
        System.out.println("Date of birthday: " + dob.getDate());
        System.out.println("Date of appointment: " + dateOfOffice.getDate());
        System.out.println("Qualification: " + qualification);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary + " FCFA");
        System.out.println("--------------------------------------------");
        System.out.println();

    }
}
