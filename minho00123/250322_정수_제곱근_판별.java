class Solution {
    public long solution(long n) {
        return  Math.sqrt(n) - (long) Math.sqrt(n) == 0 ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1L;
    }
}

