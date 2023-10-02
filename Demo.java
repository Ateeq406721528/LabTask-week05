package LabTask;
public class Demo {
    public static void main(String[] args) {
        Employee labAttendant1 = new Employee("E001", "John Doe");
        Employee labAttendant2 = new Employee("E002", "Jane Smith");

        Computer computer1 = new Computer("C001", "LCD-01", 8, 512, true);
        Computer computer2 = new Computer("C002", "LCD-02", 16, 1024, false);

        Lab lab1 = new Lab("L001", 10, labAttendant1);
        Lab lab2 = new Lab("L002", 15, labAttendant2);

        lab1.addComputer(computer1);
        lab2.addComputer(computer2);

        University university = new University(2);
        university.addLab(lab1);
        university.addLab(lab2);

        Computer fetchedComputer = university.getComputer("L001", "C001");
        System.out.println(fetchedComputer != null ? "Fetched Computer: " + fetchedComputer.getComputerNumber() : "Computer not found.");
    }
}