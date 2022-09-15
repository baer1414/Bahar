package Odev_;

public class ProjectOwner extends SoftwareDevelopmetTeam {
  private   boolean istechnical;

    public ProjectOwner(){

    }

    public ProjectOwner(String name, String surname, String teamName, String domain, boolean istechnical) {
        super(name, surname, teamName, domain);
        this.istechnical = istechnical;
    }

    public boolean isIstechnical() {
        return istechnical;
    }

    public void setIstechnical(boolean istechnical) {
        this.istechnical = istechnical;
    }
}
