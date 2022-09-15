package Odev_;

public class Tester extends SoftwareDevelopmetTeam {
  private   boolean isManual;
  static int gunluktestAdet=50;

    public Tester() {
    }


    public Tester(boolean isManual) {
        this.isManual = isManual;
    }

    public Tester(String name, String surname, String teamName, String domain, boolean isManual) {
        super(name, surname, teamName, domain);
        this.isManual = isManual;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void takeguntes(int count){
        gunluktestAdet-=count;
    }
    public static void tesAde(){

        System.out.println(gunluktestAdet);


    }
}
