package LabTask;

class University {
    private Lab[] labs;

    public University(int maxLabs) {
        this.labs = new Lab[maxLabs];
    }


    public void addLab(Lab lab) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] == null) {
                labs[i] = lab;
                break;
            }
        }
    }


    public void removeLab(String labID) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] != null && labs[i].getLabID().equals(labID)) {
                labs[i] = null;
                break;
            }
        }
    }

    public Lab getLab(String labID) {
        for (Lab lab : labs) {
            if (lab != null && lab.getLabID().equals(labID)) {
                return lab;
            }
        }
        return null;
    }

    public Computer getComputer(String labID, String computerNumber) {
        Lab lab = getLab(labID);
        if (lab != null) {
            return lab.getComputer(computerNumber);
        }
        return null;
    }
}
