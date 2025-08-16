# aug16_2025
The problem that i solved today in leetcode

You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Code:
class Solution {
    public int maximum69Number (int num) {
        StringBuilder s=new StringBuilder(String.valueOf(num));
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='6')
            {
                s.setCharAt(i,'9');
                break;
            }
        }
        return Integer.valueOf(s.toString());
    }
}
