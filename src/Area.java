import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the radius :");
        int r;
        r=sc.nextInt();
        double area;
        area = Math.PI*r*r;
        System.out.println("Area is "+area);
    }
}
