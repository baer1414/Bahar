package Odev_;

public class MainTester_1 {
    public static void main(String[] args) {
        Person_ person_ = new Person_("Bahar","EREN");
        Person_ person_1 = new Person_();
        Person_ person_2 = new Person_();
        person_2.numld();
        System.out.println(person_2.Id);
        System.out.println(person_.surName);
        person_.start();
        Developer developer=new Developer();
        developer.start();
        SoftwareDevelopmetTeam softwareDevelopmetTeam=new SoftwareDevelopmetTeam("Miray","AY","Spring","test");
        System.out.println(softwareDevelopmetTeam.getTeamName());
        System.out.println(softwareDevelopmetTeam.surName);
        Tester testerHatice=new Tester();
        Tester testerBilge=new Tester();
        Tester testerCigdem=new Tester();
        Tester testerBahar=new Tester();
        testerBahar.takeguntes(5);
        testerBilge.takeguntes(5);
        testerCigdem.takeguntes(10);
        testerHatice.takeguntes(15);
        Tester.tesAde();




    }
}
