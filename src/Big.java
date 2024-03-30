import java.math.BigInteger;

public class Big {

    public static void main(String[] args) {
        displayFactorialTable(999999);
    }

    public static void displayFactorialTable(int n) {
        System.out.println("Integer\tFactorial");
        for (int i = 0; i <= n; i++) {
            BigInteger factorial = calculateFactorial(BigInteger.valueOf(i));
            System.out.println(i + "\t" + factorial);
        }
    }

    public static BigInteger calculateFactorial(BigInteger num) {
        BigInteger factorial = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }
        return factorial;
    }
}
