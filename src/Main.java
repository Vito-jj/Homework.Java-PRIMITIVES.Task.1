public class Main {
    public static void main(String[] args) {

        int ticetPrice = 500; // Цена билета
        int bonusMilePrise = 20; // Стоимость одной бонусной мили

        int bonusMiles = ticetPrice / bonusMilePrise; // Кол-во начисленных бонусных миль

        System.out.println(("Количество начисленных миль:_") + (bonusMiles));

    }
}
