public class Tester {
    public static void main(String[] args) {
        Student james = new Student();
        james.setName("James");
        james.setAddress("Hanoi");
        james.setProgram("career");
        james.setFee(2000);
        james.setYear(2018);
        System.out.println(james.toString());

        Staff winter = new Staff();
        winter.setName("Winter");
        winter.setSchool("Hogwarts");
        winter.setPay(5000);
        winter.setAddress("England");
        System.out.println(winter.toString());
    }
}
