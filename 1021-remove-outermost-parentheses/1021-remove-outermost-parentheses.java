class Solution {
    public String removeOuterParentheses(String s) {
        int opencount=0;
        StringBuilder result = new StringBuilder();
        for(char num : s.toCharArray())
        {
            if(num == '(')
            {
                if(opencount>0)
                {
                    result.append(num);
                }
                opencount++;
            }
            else
            {
                opencount--;
                if(opencount>0)
                {
                    result.append(num);
                }
            }
        }
        return result.toString();
    }
}