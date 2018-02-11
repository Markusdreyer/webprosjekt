import java.util.Random;
import java.util.Arrays;

public class Lotto {
    public int [] lotto() {
        int [] lottoNumbers = new int[7];
        int index = 0;
        Random rnd = new Random();
        while (index < 7) {
            int number = rnd.nextInt(34) + 1;
            int check = 0;
            boolean found = false;
            while (check < index && !found) {
                if (lottoNumbers[check] == number) found = true;
                check++;
            }
            if (!found) {
                lottoNumbers[index] = number;
                index++;
            }
        }
        Arrays.sort(lottoNumbers);
        return lottoNumbers;
    }
    
    public void mainMethod() {
        int [] numbers = lotto();
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
