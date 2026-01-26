// Problem Name: Count Primes
// Problem no.: 204
//Submission Link: https://leetcode.com/problems/count-primes/submissions/1884042619/

class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        for(int i = 2; i*i <= n; i++){
            if(prime[i]==false){
                for(int j = 2; j*i<=n; j++){
                    prime[j*i]=true;
                }
            }
        }

        int cnt = 0;
        for(int i = 2; i<n; i++){
            if(prime[i]==false){
                cnt++;
            }
        }
        return cnt;
    }
}