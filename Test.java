public class Test {

    public static void main(String[] args) {
        long microsecondsInDay = 24L*60*60*1000*1000;
        long millisecondsInDay = 24*60*60*1000;
        System.out.println(microsecondsInDay);
        System.out.println(millisecondsInDay);
        long millisecondsInSecond = (microsecondsInDay/millisecondsInDay);
        System.out.println(millisecondsInSecond);
        long thirteenSecondsInMs = (millisecondsInSecond*13);
        System.out.println(thirteenSecondsInMs);
        int negativeIntMax = -Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        double negativeDoubleMax = -Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println(negativeIntMax);
        System.out.println(intMin);
        System.out.printf("%s%n",negativeIntMax>intMin);
        System.out.println(negativeDoubleMax);
        System.out.println(doubleMin);
        System.out.printf("%s%n",negativeDoubleMax>doubleMin);
    }
}
