package wexr.Opgave10_2;

public class Main {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Benjamin Olsen", 29, 172, 6, 6);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Matthias Bech", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
