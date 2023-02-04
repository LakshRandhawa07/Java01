import java.util.Scanner;
public class Maximum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if ((x > y) && (x > z))
        {
            System.out.println("x is the largest number. " + "x" + "=" + x);
        }
        else if ((y > x) && (y > z))
        { System.out.println("Y is the largest number ");
    }
    else {
            System.out.println("Z is the greatest number ");
        }
    }
}
