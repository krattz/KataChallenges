import java.util.Arrays;

public class kataChallenge7 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = {1,2,3};
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 != 0) {
                try {
                    arr3[i] = arr2[k];
                } catch (Exception e) {
                    System.out.println(e);
                }
                k++;
            } else arr3[i] = arr1[k];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
