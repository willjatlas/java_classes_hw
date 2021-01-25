public class WaterBottle {

    // Init variables
    int volume;
    int curWater;

    // Constructor.
    public WaterBottle(int volume, int curWater){
        this.volume   = volume;
        this.curWater = curWater;
    }

    // Removes 10 water from current water in bottle.
    public void drink(){ curWater -= 10; }

    // Empties the bottle.
    public void empty(){ curWater = 0; }

    // Fills the bottle.
    public void fill(){ curWater = volume; }

}
