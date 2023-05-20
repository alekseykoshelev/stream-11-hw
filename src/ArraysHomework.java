import java.util.Arrays;

public class ArraysHomework {

    public static void main(String[] args) {

        int[] values = new int[3];
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        long[] arr = new long[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i != values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i == doubles.length - 1) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i == 0) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println();


        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i == 0) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                values[i]++;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
