import java.util.Scanner;
public class Number6 {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if(x==6)
            {System.out.println("Statement is true");

            }
            else if(y==6)
            {System.out.println("Statement is true");

            }
            else if(x+y==6)
            {System.out.println("true");
            }
            else if((x-y==6)||(y-x==6))
            {System.out.println("true");}
            else
            {System.out.println("Statement is false");
            }}
}
