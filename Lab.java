package LabTask;

class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labID, int maxComputers, Employee labAttendant) {
        this.labID = labID;
        this.computers = new Computer[maxComputers];
        this.status = LabStatus.OPERATIONAL;
        this.labAttendant = labAttendant;
    }

    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                break;
            }
        }
    }

    public void removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i] = null;
                break;
            }
        }
    }

    public Computer getComputer(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }

    public void changeLabStatus(LabStatus newStatus) {
        this.status = newStatus;
    }
    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }


    public Employee getLabAttendant() {
        return labAttendant;
    }
}