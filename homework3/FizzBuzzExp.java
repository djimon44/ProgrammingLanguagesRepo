public class FizzBuzzExp {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(
                (i % 3 == 0 ? "Fizz" : "") +
                (i % 5 == 0 ? "Buzz" : "") +
                (i % 3 != 0 && i % 5 != 0 ? Integer.toString(i) : "")
            );
        }
    }
}