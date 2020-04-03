import java.util.Scanner;

public class kataChallenge2 {
    public static void main(String[]args){
        System.out.println("Enter number to test if odd or even");

        even_or_odd("");
    }
    private static String even_or_odd(String result){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        if(num%2 == 0 ){
            result = "even";
        }
        else {
            result = "odd";
        }
        System.out.println(result);
        return result;
    }
}
