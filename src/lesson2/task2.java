package lesson2;
// 3. Создайте число. Определите, является ли число трехзначным. Определите,
//является ли его последняя цифра семеркой. Определите, является ли число четным.
public class task2 {
    public static void main(String[] args) {
        int number = 119;
        if (number>99 & number<=999) {
            System.out.println("Число " + number + " является трехзначным");
        }
        else {
            System.out.println("Число " + number + " не является трехзначным");
        }
        if (number % 10 ==7 ) {
            System.out.println("Последняя цифра является 7");
        }
        else {
            System.out.println("Последняя цифра не 7");
        }
        if (number%2 ==0) {
            System.out.println("Число является четным");
        }
        else {
            System.out.println("Число является нечетным");
        }

    }
}
