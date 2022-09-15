package Odev_;

public class SoftwareDevelopmetTeam extends Person_ {

   private String teamName;
   private String domain;
   int numberOfPersonel;

    public SoftwareDevelopmetTeam() {

    }

    public SoftwareDevelopmetTeam(String name, String surname, String teamName, String domain) {
        super(name, surname);
        this.teamName = teamName;
        this.domain = domain;
    }

    public String getTeamName() {

        return teamName;
    }

    public void setTeamName(String teamName) {

        this.teamName = teamName;
    }

    public String getDomain() {

        return domain;
    }

    public void setDomain(String domain) {

        this.domain = domain;
    }

    public void dailyTime() {
        System.out.println("çalışma zamanı");
    }

    public String Sprintday() {
        String sonuc = "bu gün tempolu çalışma zamanı";
        return sonuc;
    }

}
