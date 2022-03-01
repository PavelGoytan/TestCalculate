package by.training.hoitan.test;

import by.training.hoitan.calculator.Calculate;

public class Runner {
    public static void main(String[] args) {
        String string = "-(-((2.0-2.0*9.0-8.0/3.0)-7.0*2.0)+(2.0*3.0-(4.0)))*2.0*(1-2)*(2-3)";
        String stringA = "(2+1)*(-1)/(3-2*9)";
        Calculate calculate = new Calculate();
        System.out.println(calculate.solveExpression(string));
        System.out.println(calculate.solveExpression(stringA));
    }
}
