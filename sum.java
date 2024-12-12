class sum {
    public static void main(String args[]) {
        // Check if there are at least two arguments
        if (args.length < 2) {
            System.out.println("Please enter two inputs.");
            return;
        }

        try {
            // Parse the input values
            int n1 = Integer.parseInt(args[0]);  // Use args[0] for the first input
            int n2 = Integer.parseInt(args[1]);  // Use args[1] for the second input

            // Calculate the sum
            int add= n1 + n2;

            // Print the result
            System.out.println("The sum of " + n1 + " and " + n2 + " is " + sum);
        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
