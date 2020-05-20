public class Solution{
     public static String solution(int i){
        String primestr="";
        int nth=i+1;
        int num=1, count=0, j;
        
        for(int k=0;k<5;k++) 
        {  while (count < nth)
            {   num=num+1;
                for (j = 2; i <=num; j++)
                { if (num % j == 0) 
                     {break;} 
                }
                if ( j == num)
                {count = count+1;}
            }
            nth=nth+1;
            primestr=primestr+num+"";    
        }        
        String str=new String(primestr);
        return str.substring(0,5);
    }
}
