/**
 * Given a salary
 * if salary greater than 4500 print 30% of its value
 * else print 15% of the salary.
 * */
public class CondicionaisAula3 {
    public static void main(String[] args) {

        double maxPercent = 45000;

        double salary= 50000;

        if (salary > maxPercent) {
            System.out.print("30% of " + salary + " e = ");
            System.out.println(salary * 0.3);
        } else {
            System.out.print("15% of " + salary + " e = ");
            System.out.println(salary * 0.15);
        }

    }
}
