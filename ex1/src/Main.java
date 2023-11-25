import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOFWater("qwe", 123, 100));
        productList.add(new BottleOFWater("qwe", 200, 150));
        productList.add(new BottleOFWater("zxcg", 500, 1000));
        productList.add(new BottleOFWater("qaffwe", 123, 10));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("qwe", 150));
        Product test = new BottleOFWater("asd", 123, 123);

        System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        List<Product> hotroductList = new ArrayList<>();
        hotroductList.add(new HotDrink("чай", 123, 100, 125));
        hotroductList.add(new HotDrink("кофе", 200, 90, 500));
        hotroductList.add(new HotDrink("горячий шоколад", 500, 75, 250));
        HotDrincVendingMachine hotvendingMachine = new HotDrincVendingMachine();
        hotvendingMachine.initProduct(hotroductList);
        //System.out.println(hotvendingMachine.getProduct("чай", 123, 100));
        System.out.println("Поиск по названию: " + hotvendingMachine.getProduct("чай"));

    }
}