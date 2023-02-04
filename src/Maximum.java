import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > y)
        {    System.out.println("X is the largest number");}
    else if(y>x)
        {
            System.out.println("Y is the largest number ");
        }
    else {
            System.out.println("Both ar equal");
        }
    }
}
