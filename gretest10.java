package guvi;
import java.util.*;
public class gretest10 {
    public static void main(String args[]){
    	 int a,b,c;
    	Scanner s=new Scanner (System.in);
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
        if(a>b&&a>c){
       System.out.println("a is greatest");
        }
        else if(b>a&&b>c)
            System.out.println("b is greatest");
        else
      
            System.out.println("c is greatest");
       }

}
