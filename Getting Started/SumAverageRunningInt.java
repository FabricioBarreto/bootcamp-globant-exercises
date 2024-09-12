public class SumAverageRunningInt {

    public static void main(String[] args){
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int count = 0;

        // 1- Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
            count++;
        }

        System.out.println("sum with for-loop = " + sum);
        System.out.println("Average " + sum / count);

        System.out.println("--------------------------------------------");

        // 2- Use a while to sum from 0 to upperbound
        sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        }

        System.out.println("sum with while = " + sum);

        System.out.println("--------------------------------------------");

        // 3- Use do-while to sum from 0 to upperbound
        sum = 0;
        number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);

        System.out.println("sum with do-while = " + sum);

        System.out.println("--------------------------------------------");

        // 4- sum from 111 to 8899 and print the average
        sum = 0;
        count = 0;
        for (int i = 111; i < 8899; i++) {
            sum += i;
            count++;
        }
        System.out.println("sum from 111 to 8899 = " + sum);
        System.out.println("Average = " + sum / count);

        System.out.println("--------------------------------------------");

        sum = 0;
        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sum += i * i;
        }

        System.out.println("sum of Squares = " + sum);

    }
}
