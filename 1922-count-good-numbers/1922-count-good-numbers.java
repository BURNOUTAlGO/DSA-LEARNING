class Solution {

    long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long evenCount = fastPow(5, even);
        long oddCount = fastPow(4, odd);

        return (int)((evenCount * oddCount) % MOD);
    }

    public long fastPow(long x, long pow) {

        if (pow == 0)
            return 1;

        long half = fastPow(x, pow / 2);

        long result = (half * half) % MOD;

        if (pow % 2 == 1)
            result = (result * x) % MOD;

        return result;
    }
}