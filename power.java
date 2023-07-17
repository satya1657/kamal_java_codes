import java.util.*;
public class power {
     public static void main(String[]args) {
        int n =3, p =4,result = 1;
        if(n>=0 && p==0)
        {
            result=1;
        }
        else if(n==0&&p>=1)
        {
            result=0;

        }
           else{
            for(int i=1;i<=p;i++)
            result=result*n;
           }

     }
       system.out.println(n+"^"+p+"="+result);
     }   
}
