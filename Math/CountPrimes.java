/*
 * LeetCode 204 - Count Primes
 *
 * Approach:
 * ----------
 * We use the Sieve of Eratosthenes to find all prime numbers less than n.
 *
 * Steps:
 * ----------
 * 1. Create a boolean array `prime` of size n.
 * 2. Mark all numbers from 2 to n-1 as prime initially.
 * 3. Start from 2.
 * 4. If the current number is prime, mark all of its multiples as not prime.
 * 5. Start marking from i * i because smaller multiples were already handled.
 * 6. Count all numbers that are still marked as prime.
 * 7. Return the count.
 *
 * Example:
 * ----------
 * Input:  n = 10
 * Output: 4
 *
 * Prime numbers less than 10:
 * 2, 3, 5, 7
 *
 * Time Complexity: O(n log log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int countPrimes(int n) {

        if(n <= 2){
            return 0;
        }

        boolean[] prime = new boolean[n];

        for(int i = 2; i < n; i++){
            prime[i] = true;
        }

        for(int i = 2; i * i < n; i++){

            if(prime[i]){

                for(int j = i * i; j < n; j += i){
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for(int i = 2; i < n; i++){
            if(prime[i]){
                count++;
            }
        }

        return count;
    }
}
