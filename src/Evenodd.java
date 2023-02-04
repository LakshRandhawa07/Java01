import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if(x%2==0) {
            System.out.println("X is an even number");
        }
        else{
            System.out.println("X is a odd number");

        }
    }
}
