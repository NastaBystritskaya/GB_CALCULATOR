package au.bystritskaia.calculator;

public class OutputDecorator {

    public static String decorate(int num) {
        return "Ваш результат: " + num;
    }

    public static String decorate(float num) {
        return "Ваш результат: " + Math.round(num);
    }

}
