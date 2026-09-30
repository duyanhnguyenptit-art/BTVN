public class Intern extends Employee {
    private String school;

    public Intern(String id, String name, double baseSalary, String school) {
        super(id, name, baseSalary);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public double salary() {
        return 0.7 * baseSalary;
    }
}