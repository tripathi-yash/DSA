class Solution {

    public long power(long x, int e, int M) {

        if(e == 0) return 1;

        x = x % M;

        long p = power(x, e / 2, M);

        p = (p * p) % M;

        if(e % 2 == 1) {
            p = (p * x) % M;
        }

        return p;
    }

    public int powMod(int x, int n, int M) {

        return (int)power(x, n, M);
    }
}