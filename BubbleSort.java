import java.util.Scanner;

class BubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comma-separated numbers:");

        // Read the input string
        String input = scanner.nextLine();
        // Split the string by commas and convert to integer array
        String[] stringArr = input.split(",");
        int[] arr = new int[stringArr.length];

        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i].trim());
        }

        // Bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        printArray(arr);
        scanner.close();
    }
}
