
    import java.util.Scanner;

    public class BMI {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите массу тела в килограммах: ");
            double weight = scanner.nextDouble();

            System.out.print("Введите рост в метрах: ");
            double height = scanner.nextDouble();

            double bmi = weight / (height * height);
            System.out.println("Индекс массы тела (ИМТ): " + bmi);

            if (bmi < 18.5) {
                System.out.println("Недостаточная масса тела");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("Нормальная масса тела");
            } else if (bmi >= 24.9 && bmi < 29.9) {
                System.out.println("Избыточная масса тела (предожирение)");
            } else if (bmi >= 29.9 && bmi < 34.9) {
                System.out.println("Ожирение I степени");
            } else if (bmi >= 34.9 && bmi < 39.9) {
                System.out.println("Ожирение II степени");
            } else if (bmi >= 39.9) {
                System.out.println("Ожирение III степени (крайне высокий риск для здоровья)");
            }

            scanner.close();
        }
    }


