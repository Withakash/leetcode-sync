class Solution {
    public int countDigitOne(int n) {
          int count = 0;

        for(long factor = 1; factor <= n; factor *= 10) {

            long lower = n % factor;

            long current = (n / factor) % 10;

            long higher = n / (factor * 10);

            // Case 1
            if(current == 0) {
                count += higher * factor;
            }

            // Case 2
            else if(current == 1) {
                count += higher * factor + lower + 1;
            }

            // Case 3
            else {
                count += (higher + 1) * factor;
            }
        }

        return count;
    }
    }

