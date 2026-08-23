class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int rightSum = 0;
        int leftQuestion = 0;
        int rightQuestion = 0;

        int n = num.length();

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQuestion++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQuestion++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

     
        if ((leftQuestion + rightQuestion) % 2 != 0) {
            return true;
        }

        return leftSum - rightSum != 
               (rightQuestion - leftQuestion) * 9 / 2;
    }
}