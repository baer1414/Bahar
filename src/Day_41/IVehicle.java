package Day_41;

public interface IVehicle {
    int tekerSayisi=4;
    public abstract void start();
    void stop();
    int durmaMesafesi();
    default int tekerSayisi(){
        return tekerSayisi;
    }
}
