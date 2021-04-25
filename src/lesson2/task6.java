package lesson2;
//7) (Дополнительно) В переменную записываете количество программистов. В
//зависимости от количества программистов необходимо вывести правильно окончание.
public class task6 {
    public static void main(String[] args) {
        double a = 1;
        if (a%10 == 0.1 ) {
            System.out.println(+ a + " программист" );
        }
        if (a%100 == 11) {
            System.out.println(+ a + " программистов");
        }
    }
}
