public abstract  class Employee extends Person {

    protected Date dateOfOffice;
    protected int salary;

    public Employee(String name, Date dateOfOffice, int salary, Date dob) {
        super(name, dob);
        this.dateOfOffice = dateOfOffice;
        this.salary = salary;
    }

    public abstract int getSalary();
    public abstract void setSalary(int salary);
}
