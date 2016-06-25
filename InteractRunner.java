import java.util.Scanner;

/**
 Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
class InteractRunner {

    public static void main (String[] arg) {
        Scanner reader = new Scanner (System.in);
        try {
            Calculator c = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter Action : ");
                String action = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                c.calc(Double.valueOf(first), action, Double.valueOf(second));
                System.out.println("Result : " + c.getResult());
//                c.cleanResult();
                System.out.println("Exit? : yes/no ");
                exit = reader.next();
            }
        } finally { reader.close(); }
    }
}