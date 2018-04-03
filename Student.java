public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student() {
    }

    public Student(String name, String address, String program, int year, double fee) {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
