class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int sum = 0, i=1;

        while(i*i < num){

            if(num % i == 0) {
                sum += (i + (num / i));
            }

            i++;
        }

        return num == (sum-num);
    }
}