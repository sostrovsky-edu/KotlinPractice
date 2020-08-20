package exceptions.example1;

public class TryTest {
    public static void main(String[] args) {
        System.out.println("\nResult: " +getResult());
    }

    private static int getResult() {
        try {
            return 1/0;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }
}
