package Odev_;

public class Developer extends SoftwareDevelopmetTeam {
   private String softwareLanguage;


   public Developer(){}

   public Developer(String name, String surname, String teamName, String domain, String softwareLanguage) {
      super(name, surname, teamName, domain);
      this.softwareLanguage = softwareLanguage;
   }

   public String getSoftwareLanguage() {
      return softwareLanguage;
   }

   public void setSoftwareLanguage(String softwareLanguage) {
      this.softwareLanguage = softwareLanguage;
   }
   public void start(){
      System.out.println("developer mesai 10:30 başlıyor");
   }
}
