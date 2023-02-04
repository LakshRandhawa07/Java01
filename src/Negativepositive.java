import java.util.Scanner;

public class Negativepositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if(x>0)
        {
            System.out.println("x is a positive number. " + "x" + "=" + x);
        }
        else if(x==0) {
            System.out.println("X is zero");}
            else{
                System.out.println("X is a negative number");
            }
        }
    }

