package Odev_;

public class Human_Recources extends Person_ {
   private String areaResponsibility;

    public Human_Recources(String name,String surName,String areaResponsibility) {
        super(name,surName);
        this.areaResponsibility = areaResponsibility;
    }

    public String getAreaResponsibility() {
        return areaResponsibility;
    }

    public void setAreaResponsibility(String areaResponsibility) {
        this.areaResponsibility = areaResponsibility;
    }
}
