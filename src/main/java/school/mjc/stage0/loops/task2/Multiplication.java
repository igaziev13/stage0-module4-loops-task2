package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        while (i<=multiplyByAndToInclusive)
        {
            System.out.println(i*multiplyByAndToInclusive);
            i++;
        }
        i=0;
        while (i>=multiplyByAndToInclusive)
        {
            System.out.println(i*multiplyByAndToInclusive);
            i--;
        }
    }
    public static void main(String[] args)
    {
        printMultiplied(-5);

    }
}
