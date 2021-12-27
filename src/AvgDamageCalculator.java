class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        int result = 0;
        for (int sampleValue : samples) {
            sum += sampleValue;
        }
        try {
            result =  sum / samples.length;

        } catch (ArithmeticException e) {

        }
        return result;
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}