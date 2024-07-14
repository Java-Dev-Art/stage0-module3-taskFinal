package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        char[] mas = Integer.toString(number).toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = mas.length -1; i >= 0; i--){
            result.append(mas[i]);
        }
        System.out.println(result);
    }
}
