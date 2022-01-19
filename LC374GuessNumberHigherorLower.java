/**
* Created with IntelliJ IDEA.
* Description:
* User: JasperRui
* Date: 2022-01-19
* Time: 15:15
* Description:
*/public class LC374GuessNumberHigherorLower {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int left = 0;
            int right = n;

            while(left < right){
                int mid = left + (right - left)/2;

                if(guess(mid) <= 0) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }

            return right;
        }
    }
}
