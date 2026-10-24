class Solution {
    public int subtractProductAndSum(int n) {
        int dig = 0;
        int sum = 0;
        int prod = 1;

        while(n > 0){

            dig = n % 10;
            prod *= dig;
            sum += dig;
            n /= 10;
        }

        return prod - sum;

    }
}