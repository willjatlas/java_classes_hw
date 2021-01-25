public class WaterBottle {

    int volume = 100;
    int curWater = 100;

    // Removes water from current water in bottle. 
    public int drink(int amount){

        curWater -= amount;
        return curWater;

    }

}
