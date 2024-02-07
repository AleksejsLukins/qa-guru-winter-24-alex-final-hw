package model;

public class Office {

    private String officeName;
    private String officeType;
    private int officeFloors ;
    private int officeWorkers;
    private int officeCost;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public int getOfficeFloors() {
        return officeFloors;
    }

    public void setOfficeFloors(int officeFloors) {
        this.officeFloors = officeFloors;
    }

    public int getOfficeWorkers() {
        return officeWorkers;
    }

    public void setOfficeWorkers(int officeWorkers) {
        this.officeWorkers = officeWorkers;
    }

    public int getOffcieCost() {
        return officeCost;
    }

    public void setOffcieCost(int offcieCost) {
        this.officeCost = offcieCost;
    }


}
