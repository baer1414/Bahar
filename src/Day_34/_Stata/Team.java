package Day_34._Stata;

public class Team {
    String name;
    static int team;

    public Team(String name) {
        this.name = name;
    }
    public static void teamChangeTo(int i){
        team=i;

    }


    public void getInfo() {
        System.out.println( "Team{" +
                "team= "+team+
                " name= " + name + '}');
    }
}
class main{
    public static void main(String[] args){
        Team nember1=new Team("Bahar");
        Team nember2=new Team("Hatice");
        Team nember3=new Team("Bilge");
        Team nember4=new Team("Çiğdem");
        nember1.getInfo();
    Team.teamChangeTo(1);
             nember1.getInfo();
             nember2.getInfo();
             nember3.getInfo();
             nember4.getInfo();
    }
}
