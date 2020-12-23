public class FizzBuzzTranslate {

    public static final String DIVIDE = "divide_";
    public static final String NUM = "";

    public static String traslate(int a) {

        String s = NUM;

        if (isDivide(a, 15)){
            s = DIVIDE + a;
        }else if (isDivide(a, 3)) {
            s = DIVIDE + a;
        } else if (isDivide(a, 5)){
            s = DIVIDE + a;
        }else {
            s = NUM +a;
        }
            return s;
    }


    private static boolean isDivide(int a, int i) {
        return a % i == 0;
    }


}
