package lesson2;
//2. Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?
public class task4 {
    public static void main(String[] args) {
        double a = 8533;
        if ((a%10) != ((a-a%10)%100/10)){// != ((a - a%10-(a-a%10)%100)%1000/100) != ((a -a%10-(a-a%10)%100-(a - a%10-(a-a%10)%100)%1000)/1000)) {
            System.out.println("Числа различны");
        }
    }
}
