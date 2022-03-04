/*
* Reference values
* 30%
* 15%
* 5%
* */
public class Calculator {
    public static void main(String[] args) {
        float salary = 2500;
        float thirtyPercent = .30f;
        float fifteenPercent = .15f;
        float fivePercent = .05f;

        float result = salary * thirtyPercent;
        System.out.println("30% of " + salary + " é:" + result);

        result = salary * fifteenPercent;
        System.out.println("15% of " + salary + " é: " + result);

        result = salary * fivePercent;
        System.out.println("5% of " + salary + " é: " + result);

    }
}
