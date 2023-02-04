import java.util.Scanner;

public class Divisible5and11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if((x%5==0)&&(x%11==0)) {
            System.out.println("X is divisible by 5 and 11");}
        else
            {
                System.out.println("X is not divisible by 5 and 11");
            }
        }
    }

