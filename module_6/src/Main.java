public class Main {
    void main(String[] args) {

        Date dateOfStudent = new Date(12, 12, 1999);
        Date dateOfTeacher = new Date(23, 9, 1989);
        Date dateOfAppointment = new Date(12, 3, 2018);

        Teacher teacher = new Teacher("pual", "svt", "MIT_SCIENCE", dateOfAppointment, dateOfTeacher, 0);
        Student student = new Student("SVT", teacher, "sylvie", dateOfStudent );

        teacher.setSalary(2000000);

        teacher.getDetails();
        student.getDetails();





    }
}