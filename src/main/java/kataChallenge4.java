import java.util.Scanner;

public class kataChallenge4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your Triangle: ");
        int size = sc.nextInt();
        for (int i = 0; i< size; i++){
            for (int j = 0; j< size; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
