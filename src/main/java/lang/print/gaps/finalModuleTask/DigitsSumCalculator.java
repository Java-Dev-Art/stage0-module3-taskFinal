package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        char[] mas = Integer.toString(number).toCharArray();
        int result = 0;
        for (int i = 0; i < mas.length ; i++){
            String beforeInt = String.valueOf(mas[i]);
            int beforeResult = Integer.valueOf(beforeInt);
            result += beforeResult;
        }
        System.out.println(result);
    }
    public static void main(String[] arg){
        DigitsSumCalculator cal = new DigitsSumCalculator();
        cal.calculateSum(1111);
    }
}
