package main;

public class CalcApplication {

    private static CalculatorService calcService;

    public void setCalcService(CalculatorService calcService) {
        this.calcService = calcService;
    }

    public static double add(double numA, double numB){
        return calcService.add(numA, numB);
    }

    public double subtract(double numA, double numB){
        return calcService.subtract(numA, numB);
    }

    public double multiply(double numA, double numB){
        return calcService.multiply(numA, numB);
    }

    public double divide(double numA, double numB){
        return calcService.divide(numA, numB);
    }

}
