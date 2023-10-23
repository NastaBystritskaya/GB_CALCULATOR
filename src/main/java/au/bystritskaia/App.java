package au.bystritskaia;

import au.bystritskaia.calculator.Calculator;
import au.bystritskaia.calculator.OutputDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(OutputDecorator.decorate(calculator.sum(2, 2)));
        System.out.println(OutputDecorator.decorate(calculator.dif(2, 2)));
        System.out.println(OutputDecorator.decorate(calculator.div(2, 2)));
        System.out.println(OutputDecorator.decorate(calculator.mul(2, 2)));
    }
}
