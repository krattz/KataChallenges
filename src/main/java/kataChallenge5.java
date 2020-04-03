import java.util.Scanner;

public class kataChallenge5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your triangle");
        int size = sc.nextInt();
        int space = size ;
        for(int i=1; i<=size;i++){
            for(int j=space; j>i ;j--) {
                System.out.print(" ");
            }
            for(int k = 0;k < (i*2-1);k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
