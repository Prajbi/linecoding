import java.util.Scanner; // Import the Scanner class for user input

public class LINECODING // Main class for line coding implementations
{
    // Function for Unipolar NRZ Encoding
    static void Unipolar(int[] data) {
        System.out.print("Unipolar NRZ Encoding: ");
        for (int bit : data) { // Loop through each bit in the data
            if (bit == 1) {
                System.out.print("|-|"); // High signal for bit 1
            } else {
                System.out.print("|_|"); // Low signal for bit 0
            }
        }
        System.out.println(); // Move to the next line after printing the encoded data
    }

    // Function for Polar NRZ Encoding
    static void Polar(int[] data) {
        System.out.print("Polar NRZ Encoding: ");
        for (int bit : data) { // Loop through each bit
            if (bit == 1) {
                System.out.print("|-|"); // Positive signal for bit 1
            } else {
                System.out.print("|_|"); // Negative signal for bit 0
            }
        }
        System.out.println(); // Move to the next line
    }

    // Function for Polar RZ Encoding
    static void PolarNRZ(int[] data) {
        System.out.print("Polar NRZ Encoding: ");
        for (int bit : data) { // Loop through the bits
            if (bit == 1) {
                System.out.print("|-|"); // Positive signal for 1
            } else {
                System.out.print("|_|"); // Zero for 0
            }
        }
        System.out.println(); // Next line
    }

    // Function for Manchester Encoding
    static void Manchester(int[] data) {
        System.out.print("Manchester Encoding: ");
        for (int bit : data) { // Traverse through the bits
            if (bit == 1) {
                System.out.print("|_^^|"); // Transition high to low for 1
            } else {
                System.out.print("|^^_|"); // Transition low to high for 0
            }
        }
        System.out.println(); // End line
    }

    // Function for Differential Manchester Encoding
    static void differentialManchester(int[] data) {
        System.out.print("Differential Manchester Encoding: ");
        int lastTransition = 1; // Track last signal transition
        for (int bit : data) { // Loop through the bits
            if (bit == 0) {
                // Maintain the last transition for bit 0
                if (lastTransition == 1)
                    System.out.print("|_^^|");
                else
                    System.out.print("|^^_|");
            } else {
                // Flip the transition for bit 1
                if (lastTransition == 1)
                    System.out.print("|^^_|");
                else
                    System.out.print("|_^^|");
            }
            // Maintain the last transition state (incorrect handling of lastTransition)
        }
        System.out.println(); // End line
    }

    // Main function where program execution begins
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        int n;
        System.out.println("Enter the size:"); // Prompt user to input size of data array
        n = sc.nextInt(); // Read the size

        int[] data = new int[n]; // Initialize array to store the data

        System.out.println("Enter the data:"); // Prompt user for the binary data
        for (int i = 0; i < n; i++) { // Loop to read each binary value
            data[i] = sc.nextInt(); // Store binary value in data array
        }

        // Call each encoding function with the input data
        Unipolar(data);
        Polar(data);
        PolarNRZ(data);
        Manchester(data);
        differentialManchester(data);
    }
}
