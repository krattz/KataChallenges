public class kataChallenge7 {
    public static void frame(int n, int m, String [] word )
    {
        String star = "";
        int i, j = 0;
        for (i = 1; i <= 2; i++) {

            for (j = 1; j <= m-1; j++) {

                if (i == 1 || j == 0) {
                    star += "*";
                }
            }
            System.out.println(star);

            if (i == 1 || j == 1) {
                for (int k = 0; k < word.length; k++) {
                    for (int f = 0; f < word.length; f++) {
                        if ((word[f].length() + 2) != (m-2)) {
                            word[f] += " ";
                        }
                    }
                    System.out.println("* " + word[k] + "*");
                }
            }
        }
    }
    public static void main(String[] args) {
        String [] word = {"Write","good","code","every","day"};
        frame(8, 10  , word);
    }
}
