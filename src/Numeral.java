public class Numeral {
    public static String toNumeral(int n) {
        if (n <= 0)
           return "";

        StringBuilder builder = new StringBuilder();

        if (n == 4)
        {
            builder.append("I");
            n++;
        }

        if (n >= 5)
        {
            builder.append("V");
            n = n - 5;
        }

        for (int i = 0; i < n; i++)
            builder.append("I");

        return builder.toString();
    }
}
