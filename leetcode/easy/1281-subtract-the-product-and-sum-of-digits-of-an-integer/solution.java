class Solution {
    public int subtractProductAndSum(int n) {
        
        int temp = n, sum = 0;
        long prod = 1;

        while(temp > 0){

            int dig = temp % 10;
            prod *= dig;
            sum += dig;
            temp /= 10;
        }

        return (int)(prod - sum);

    }
}