public class Multiples {
    public static int MultiplesCounter(int n, int a, int b) {
        int count = 0;
        // We iterate thorough 1 to n-1 which is exactly below n
        for (int i = 1; i < n; i++) {

            // Find out which numbers are the multiples of 3 or 5
            boolean multipleOfA = i % a == 0;
            boolean multipleOfB = i % b == 0;


            if (multipleOfA || multipleOfB) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Parse the input arguments as integers
        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int result = MultiplesCounter(n, a, b);

        // Print the result
        System.out.println("There are " + result + " multiples of " + a + " or " + b + " below " + n + ".");
    }
}

