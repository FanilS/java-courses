/**
 * Created by Fanil on 25.06.2016.
 */
/**
 Класс реализует калькулятор
 */
public class Calculator {

/*    Метод реализует анализ какую математическую операцию должен выполнить калькулятор*/
    public void calc(double a, String o, double b) {
        if (o.equals("+")) {
            System.out.println(a + " + " + b + " = " + add(a,b));
            return;
        }
        if (o.equals("-")) {
            System.out.println(a + " - " + b + " = " + sub(a,b));
            return;
        }
        if (o.equals("*")) {
            System.out.println(a + " * " + b + " = " + mul(a,b));
            return;
        }
        if (o.equals("/")) {
            System.out.println(a + " / " + b + " = " + div(a,b));
            return;
        }
        System.out.println("Unknown operation");
    }

//    public double add(double a, double b) {
//        result = a+b;
//        return a + b;
//    }

    public double sub(double a, double b) {
        result = a-b;
        return a - b;
    }

    public double mul(double a, double b) {
        result = a*b;
        return a * b;
    }

    public double div(double a, double b) {
        result = a/b;
        return a / b;
    }

    /**
     Результат вычисления
     */
    private double result;

	/**
		Суммируем аргументы
		@param params Аргументы суммирования
	*/
	public double add(double ... params) {
		for (double param : params) {
			this.result += param;
		}
        return this.result;
	}

    /**
     Получить результат.
     @return результат вычисления
     */
    public double getResult() {
        return this.result;
    }

    /**
     Очистить результат вычисления
     */
    public void cleanResult() {
        this.result = 0;
    }

}