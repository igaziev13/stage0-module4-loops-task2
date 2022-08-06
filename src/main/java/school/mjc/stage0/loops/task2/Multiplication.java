package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = multiplyByAndToInclusive==0 ? 1 : 0;
        while (i<=multiplyByAndToInclusive)
        {
            System.out.println(i*multiplyByAndToInclusive);
            i++;
        }
        int j = multiplyByAndToInclusive==0 ? -1 : 0;
        while (j>=multiplyByAndToInclusive)
        {
            System.out.println(-j*multiplyByAndToInclusive);
            j--;
        }
    }
}
