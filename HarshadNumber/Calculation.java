public class Calculation {
    public static void getHarshadNumbers(int limit) {
        getHarshadNumbers(1, limit);
    }

    public static void getHarshadNumbers(int start, int limit) {
        if (start <= 0)
            start = 1;
        for (int number = start; number <= limit; number++) {
            int n = 0;
            int numberCopy = number;
            while (numberCopy != 0) {
                numberCopy /= 10;
                n++;
            }
            int[] array = new int[n];
            int subtract = 0;
            int digitSum = 0;
            for (int ii = 0; ii < array.length; ii++) {
                n--;
                double pow = Math.pow(10, n);
                array[ii] = number / (int) pow;
                if (ii == 0)
                    subtract = array[0] * (int) pow;
                if (ii > 0) {
                    array[ii] = (number - subtract) / (int) pow;
                    subtract += array[ii] * (int) pow;
                }
                digitSum += array[ii];
            }
            if (number % digitSum == 0)
                System.out.println(number);
        }
    }
    public static void isHarshadNumber(int number) {
        int n = 0;
        int numberCopy = number;
        while (numberCopy != 0) {
            numberCopy /= 10;
            n++;
        }
        int[] array = new int[n];
        int subtract = 0;
        int digitSum = 0;
        for (int i = 0; i < array.length; i++) {
            n--;
            double pow = Math.pow(10, n);
            array[i] = number / (int) pow;
            if (i == 0)
                subtract = array[0] * (int) pow;
            if (i > 0) {
                array[i] = (number - subtract) / (int) pow;
                subtract += array[i] * (int) pow;
            }
            digitSum += array[i];
        }
        System.out.println(number % digitSum == 0);
    }
}
