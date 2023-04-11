public class WaterBottle {

    private int volume = 100;

//    public WaterBottle(){
//        this.volume = 100;
//    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){
        setVolume(this.volume - 10);
    }

    public void empty(){
        setVolume(0);
    }

    public void fill(){
        setVolume(100);
    }
}
