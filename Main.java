public class Main {
    public static void main(String[] args) {

        int depositAmount = 1100; //  Сумма пополнения  в рублях
        int initialAccount = 100; // Начальный счёт в рублях
        int bonus = 1; // бонус в рублях
        int condition = 100; // в рублях

        int bonusAmount;
        if (depositAmount > 1000) {
            bonusAmount = depositAmount / condition;
        } else {
            bonusAmount = 0;
        }

        int finalScore = initialAccount + depositAmount + bonusAmount;
        System.out.println("Итоговый счёт : "  + finalScore );
    }
}