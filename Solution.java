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