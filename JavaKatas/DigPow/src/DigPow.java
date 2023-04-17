public class DigPow {

    public static long digPow(int n, int p) {

        String temp = Integer.toString(n);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        int sum = 0;
        for (int x : numbers) {
            sum += Math.pow(x, p);
            p++;
        }
        System.out.println(sum);
        boolean thereIsValueForK = (sum % n == 0) ? true : false;

        return thereIsValueForK ? sum / n : -1;
    }

    public static void main(String[] args) {
        long x = digPow(89, 1);
        System.out.println(x);
    }
}
