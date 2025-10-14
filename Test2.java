public class Test2 {

    public static void vechileCalc( int v , int w){

        int  l = 1;
        int  r = v;

        int mid,fw=0;
        int tw =0;

        while ( l<=r){

            mid = l +(r-l)/2;

            int calc = mid*4 +(v-mid)*2;

            if (calc == w){
                fw = mid;
                tw = v-mid;
                break;
            }
            else if ( calc < w){
                l=mid-1;

            }
            else {
                r= mid-1;
            }
        }

        System.out.println( " No of four Wheelers" + fw);
        System.out.println("no of  two wheellers " + tw);
        
    }

    public static int minOperations( String s){

        int starCnt=0;
        int HashCnt =0;

        for ( int i=0 ; i< s.length() ; i++){

            if (s.charAt(i)=='*') starCnt++;
            else HashCnt++;
        }
        return starCnt - HashCnt;
    }

    public static void main( String[] args ){

        vechileCalc(200, 540);

        int ans = minOperations("***###");
        System.out.println(ans);
        int ans2 = minOperations("**####");
        System.out.println(ans2);
        int ans3 = minOperations("**");
        System.out.println(ans3);

        
    }

    public static int ParkingProb( int r ,int c , int[] nums){

        int[] row = new int[r];

        for ( int i=0 ; i< nums.length ; i++){

            if (nums[i]==1){
                row[i/r]+=1;
            }
        }
        int max =0;

        for ( int i=0 ; i<r;i++){
            if (row[i]>max)
                max= row[i];
        }
        return max;
    }




    public static int maxInParty( int[]E , int[]L , int T){
        int max =E[0];
        int memberCnt =E[0];
        for ( int i=1 ; i< T ;i++){
            
            
            memberCnt -= L[i-1];
            max = Math.max(max,memberCnt);
            memberCnt += E[i];

        }
        return max;
    }
    
}
