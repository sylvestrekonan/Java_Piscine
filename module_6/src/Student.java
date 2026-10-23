public class Student extends Person {

    private String subject;
    private Teacher teacher;

    public Student(String subject, Teacher teacher, String name, Date dob) {
        super(name, dob);
        this.subject = subject;
        this.teacher = teacher;
        this.dob = dob;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void getDetails() {
        System.out.println("--------- INFORMATION OF STUDENT ------------");
        System.out.println("the name of student: " + name);
        System.out.println("Date of birthday: " + dob.getDate());
        System.out.println("Subject: " + subject);
        System.out.println("name of the head teacher: " + teacher.name);
        System.out.println("--------------------------------------------");
    }
}
