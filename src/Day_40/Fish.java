package Day_40;

public class Fish implements Animal,Food {//multi inheritance
//animal class imlements olmasa bile iki method implemet etmek zorunda
    //hiyarerşik olarak bağlı
    @Override
    public void hun() {

    }

    @Override
    public void meal() {

    }
}
class chicken implements Food{//class hiyareşik olarak iki interface bağlı olduğu içicin
    //bütün abstrack methodlarin implementoslarını
    @Override
    public void meal() {

    }

    @Override
    public void hun() {
    }
}