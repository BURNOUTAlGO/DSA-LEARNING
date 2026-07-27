import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        solve("",0,0,n,list);
        return list;
        
    }
    public void solve(String curr , int index,int count,int n, List<String> list){

        if(count<0) return;
        if(index==2*n){
            if(count==0){
                list.add(curr);
            }
            return;
        }


        solve(curr+'(',index+1,count+1,n,list);
        solve(curr+')',index+1,count-1,n,list);

    }
}