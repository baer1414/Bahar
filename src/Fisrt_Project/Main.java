package Fisrt_Project;

public class Main {
    public static void main(String[] args) {

        Housuwife_Daily_Tasks evHanimi_1=new Housuwife_Daily_Tasks();
        evHanimi_1.isim="Şennur";
        evHanimi_1.soyAdi="KÜÇÜK";
        evHanimi_1.yas=34;
        evHanimi_1.boy=160;
        evHanimi_1.gozRengi="mavi";
        System.out.println("adı "+evHanimi_1.isim+" soyadı "+evHanimi_1.soyAdi+" yaşı "+evHanimi_1.yas+" boyu "+evHanimi_1.boy+" gözrengi "+evHanimi_1.gozRengi);

        evHanimi_1.sabah();
        evHanimi_1.kahvalti();
        evHanimi_1.temizlik();
        evHanimi_1.ogleYemegi();
        evHanimi_1.ikindiCayi();
        evHanimi_1.aksamYmegi();
        evHanimi_1.oturma();
        evHanimi_1.gunBitti();

        Housuwife_Daily_Tasks.message();
        evHanimi_1.evİhtiyac();









    }
}
