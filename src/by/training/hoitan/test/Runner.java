package by.training.hoitan.test;

import by.training.hoitan.calculator.Calculate;

public class Runner {
    public static void main(String[] args) {
        String string = "-(((2.0-2.0*9.0-8.0/3.0)-7.0*2.0)+(2.0*3.0-(4.0)))*2.0";
        Calculate calculate = new Calculate(string);
        System.out.println(calculate.solveExpression());
    }
}
