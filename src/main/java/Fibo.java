public class Fibo {
    public static long fibonacciFor(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static int[] fibonacciWhile(int n) {
        int[] arr1 = new int[n];
        int i = 2;
        arr1[0] = 0;
        arr1[1] = 1;
        while (i < n) {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
            i++;
        }
        return arr1;
    }

    public static int[] fibonacciDoWhile(int n) {
        int[] arr1 = new int[n];
        int i = 2;
        arr1[0] = 0;
        arr1[1] = 1;
        do {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
            i++;
        } while (i < 15);
        return arr1;
    }
}

