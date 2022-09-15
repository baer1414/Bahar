package Day_34._Stata;

public class BlockVs {
    int i;

    public BlockVs(int i) {
        this.i = i;
        System.out.println("constructor çalıştı");
    }
    static{
        System.out.println("static blok calıştı");
    }
    {
        System.out.println("intance block çalıştı");
    }
}
