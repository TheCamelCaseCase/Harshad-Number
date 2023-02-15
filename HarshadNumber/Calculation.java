package HarshadNumber;

public class Calculation {
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
        if (number % digitSum == 0)
            System.out.println("You have found a harshad number.");
        else
            System.out.println("The number you have typed in is not a harshad number");
    }
}