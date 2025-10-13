import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static  String zigzagPattern ( String s, int numRows) {

        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for ( int i=0 ; i<numRows ; i++) {
            for ( int j=i ; j<n ; j=j+(2*(numRows-1))){

                ans.append(s.charAt(j));
                if ( i!=0 && j+2*(numRows-1)-2*i<n){
                    ans.append(s.charAt(j+2*(numRows-1)-2*i));
                }
            }
        }
        return ans.toString();
    }

    public static List<String> GenerateParan( int n ){

        List<String> ans = new ArrayList<>();

        solve(n,n,ans,new StringBuilder());
        return ans;

    }
    public static void solve( int open , int close , List<String>ans,StringBuilder sb){

        if ( open==0 & close ==0) {
            ans.add(sb.toString());
            return ;
        }

        if ( open >0) {
            sb.append("(");
            solve(open-1,close,ans,sb);
            sb.setLength(sb.length()-1);
        }
        if ( close > 0 && close >open){

            sb.append(")");
            solve(open,close-1,ans,sb);
            sb.setLength(sb.length()-1);
        }
    }

    public static int searchInsertPosition( int[] nums, int target) {

        int l =0 ;
        int r = nums.length-1;
        int mid;

        while (l<=r) {

            mid = l+(r-l)/2;

            if ( nums[mid]== target) return mid;
            else if(nums[mid]>target) r = mid-1;
            else l = mid+1;

            
        }
        return l;

    }

    public static List<Integer> search( String s , List<String> words){

        int n = s.length();
        int inc = words.get(0).length();

        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[words.size()];

        for( int i=0 ; i<n ; i+=inc){

            if( solve2(s,i,words,0,vis)){

                Arrays.fill(vis, false);

                ans.add(i);
        
            }
            
        }
        return ans;
    }

    public static boolean solve2( String s , int i , List<String> words , int match , boolean[] vis){

        if ( i>=s.length()) return match == words.size();

        if ( match == words.size() ) return true; 

        for ( int ind =0 ; ind <words.size();ind++) {

            if (vis[ind]) continue;

            String st = words.get(ind);

            if(  i+st.length() <= s.length() && s.substring(i, i+st.length()).equals(st) ) {
                
                vis[ind]=true;
                 if (solve2(s,i+st.length(),words,match+1,vis)) {
                    return true;
                 }
                vis[ind]=false;
            }
            
        }
        return false;
    }
    

    public static void  countPattern( int n) {

        int[] input = new int[2*n];
        input[0] = 1;
        int curlen =1;
        int[] next = new int[2*n];
        int nexlen =0;

        for ( int i=1 ; i<n ; i++){
            
            for ( int ind =0 ; ind <curlen ; ){

                int ch = input[ind];

                if (ch == input[ind]){
                    int cnt =0;
                    while(ind<curlen  && ch == input[ind]){
                        cnt++;
                        ind++;
                    }
                    next[nexlen++]=cnt;
                    next[nexlen++] = ch;
                }
            }
            input = next;
            next = new int[2*n];
            curlen = nexlen;
            nexlen =0;
            
        }

        for ( int i=0 ; i<curlen;i++){
            System.out.print(input[i]+" ");
        }

    }
   
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("bar");
        words.add("foo");
        words.add("the");

    }
    
}
