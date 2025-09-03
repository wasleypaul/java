public class exception {
    public static void main(String[] args) {
        int[] number = { 10, 12, 13 };
        int result;

        try {
            result = number[1] / 0;
        } catch (Exception e) {
            System.out.println("Error: Cannot divide by zero");
        }

        try {
            System.out.println((number[5]));
        } catch (Exception e) {
            System.out.println("Erro: array index is not bounds");
        } finally {
            System.out.println("Finally block executed: cleaing up resources");
        }
        System.out.println("Program continues after exception handling ");
    }
}