class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int totalDrunk = numBottles;
        int exchangedBottles = numBottles / numExchange;
        int remToDrink = exchangedBottles + (numBottles % numExchange);

        while(remToDrink >= numExchange){

            totalDrunk += exchangedBottles;
            exchangedBottles = remToDrink / numExchange;
            remToDrink = exchangedBottles + (remToDrink % numExchange);
        }

        return totalDrunk += exchangedBottles;
    }
}