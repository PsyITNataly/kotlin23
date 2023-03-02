fun main() {

    val price: Int = 20000;
    var sum: Int = 0;
    var sum2: Int = 0;
    val discount1: Int = price * 5 / 100;
    var discount2: Int = (price - discount1) * 1 / 100;


    if (price < 1000) {
        sum = price;
    } else if (price >= 1_000 && price < 10_000) {
        sum = price - 100;

    } else if (price >= 10_000) {
        sum = price - discount1;
    }
    sum2 = sum - discount2; // если это постоянный покупатель


    println("Сумма покупки " + sum + " рублей")
    println("Сумма покупки " + sum2 + " рублей, если вы постоянный покупатель")

}