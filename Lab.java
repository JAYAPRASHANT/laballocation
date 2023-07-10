package Lab;
import java .util.Scanner;
public class Lab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();

        int X1=Math.abs(x-n);
        int Y1=Math.abs(y-n);
        int Z1=Math.abs(z-n);
        if(X1<=Y1 && X1<=Z1){
            System.out.println("l1");
        }
        else if(Y1<=X1 && Y1<=Z1){
            System.out.println("l2");
        }
        else{
            System.out.println("l3");
        }
    }
}
       