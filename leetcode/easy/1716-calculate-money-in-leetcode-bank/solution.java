class Solution {
    public int totalMoney(int n) {
       int monAmt = 1, runAmt = 0, dayCount = 0, nthDayAmt = 0;

       while(n-- > 0){
        
            if(dayCount > 0 && dayCount % 7 == 0){
                monAmt += 1;
                dayCount = 0;
                runAmt = monAmt;
            } else {
                runAmt += 1;
            }

            nthDayAmt += runAmt;
            dayCount++;
       }

       return nthDayAmt; 
    }
}