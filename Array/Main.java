import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a[] = new int[4];

        for(int i = 0; i< 4; i++){
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<4; i++){
            System.out.print(a[i] + " ");
        }

        int b[][] = new int[1][1];
        b[0][0] = 2;
        System.out.println(b[0][0]);
    }    
}
