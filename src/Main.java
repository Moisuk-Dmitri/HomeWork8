public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{ 1, 2, 3 };
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        boolean[] arr3 = new boolean[]{true, false , true , true, false};
        System.out.println("Task 1-2");
        for (int i = 0; i < arr1.length; i++) {
            if (i != (arr1.length - 1)) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i] + "\n");

            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i != (arr2.length - 1)) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i] + "\n");

            }
        }

        for (int i = 0; i < arr3.length; i++) {
            if (i != (arr3.length - 1)) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i] + "\n");

            }
        }

        System.out.println("Task 3");
        for (int i = (arr1.length - 1); i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i] + "\n");

            }
        }

        for (int i = (arr2.length - 1); i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i] + "\n");

            }
        }

        for (int i = (arr3.length - 1); i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i] + "\n");

            }
        }

        System.out.println("Task 4");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (i != (arr1.length - 1)) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i] + "\n");

            }
        }
    }
}