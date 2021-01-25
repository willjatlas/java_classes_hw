public class WaterBottle {

    int volume = 100;
    int curWater = 100;

    // Removes 10 water from current water in bottle.
    public void drink(){ curWater -= 10; }

    // Empties the bottle.
    public void empty(){ curWater = 0; }

    // Fills the bottle.
    public void fill(){ curWater = volume; }

}
