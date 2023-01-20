import java.util.Arrays;

public class CalculateAvg {

    public static void main(String[] args) {
        CalculateAvg calculateAvg = new CalculateAvg();
        int[] tab = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double avgOfTab = calculateAvg.getAvgOfTab(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(avgOfTab);
    }

    public double getAvgOfTab(int[] numberOfInt) {
        double sum = 0;
        for (int j : numberOfInt) {
            sum = sum + j;
        }
        return sum / numberOfInt.length;
    }
}

