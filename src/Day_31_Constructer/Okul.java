package Day_31_Constructer;

public class Okul {
    public String renk;
    public int kapasite;
    public int sinifAdedi;


    public Okul() {
        System.out.println("parametsiz");
    }

    public Okul(String renk) {
        this.renk = renk;
    }

    public Okul(String renk, int kapasite, int sinifAdedi) {
        this();

        this.renk = renk;
        this.kapasite = kapasite;
        this.sinifAdedi = sinifAdedi;
    }


    public void KapasiteOran() {
        if (this.kapasite > 500) {
            System.out.println("kapasite aşılmıltır.");
        } else {
            System.out.println("doğru giriş");
        }
    }
}