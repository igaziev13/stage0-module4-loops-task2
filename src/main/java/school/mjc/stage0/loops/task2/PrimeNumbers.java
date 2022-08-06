package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 0;
        while (num<=printToInclusive)
        {
            int i = 2, counter = 0;
            while (i <= num / 2)
            {
                if (num % i == 0){
                    counter++;
                    break;
                }
                i++;
            }
            if (counter==0)
                System.out.println(num);
            num++;
        }
    }
}
