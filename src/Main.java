//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int costTicket = 8_563;
        // объявляем переменную стоимость билета
        int costMile = 20;
        // объявляем переменную стоимость мили
        int bonus = costTicket / costMile;
        // рассчитываем количество бонусов, которые начислятся за покупку билета
        System.out.println("За приобретенный билет Вам начислится бонус в " + bonus + " миль");

    }
}