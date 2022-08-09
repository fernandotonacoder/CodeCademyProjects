import java.util.ArrayList;
import java.util.List;

public class FoodMenu {

    private List<Food> menu;

    public FoodMenu() {
        menu = new ArrayList<>();
        Food pasta = new Food("Pasta", "Italian traditional pasta", 10);
        Food pizza = new Food("Pizza", "Genuine Italian pizza", 12);
        Food caldoVerde = new Food("Caldo verde", "Portuguese traditional soup", 4);
        Food water = new Food("Water","1 liter bottle", 1);
        Food wine = new Food("Red wine","75ml bottle of Portuguese wine",5);
        Food beer = new Food("Beer", "Regular Pilsner beer", 2);
        Food cola = new Food("Cola", "Coca-Cola", 2);
        Food mousse = new Food("Chocolate Mousse","Homemade chocolate mousse", 3);
        Food espresso = new Food("Espresso","Short coffee", 1);
        menu.add(pasta);
        menu.add(pizza);
        menu.add(caldoVerde);
        menu.add(water);
        menu.add(wine);
        menu.add(beer);
        menu.add(cola);
        menu.add(mousse);
        menu.add(espresso);
    }

    public Food getFood(int index) {
        int realIndex = index -1;
        if(realIndex >= menu.size() || realIndex < 0){
             return null;
         }
        return menu.get(realIndex);
    }

    public Food getLowestCostFood() {
        Food current = null;
        int minValue = Integer.MAX_VALUE;
        for (Food food : menu) {
            int currentPrice = food.getPrice();
            if(currentPrice < minValue) {
                minValue = currentPrice;
                current = food;
            }
        }
        return current;
    }

    @Override
    public String toString() {
        String initial = "";
        for (int i = 0; i < menu.size(); i++) {
         initial += (i + 1) + ". " + menu.get(i).getName() + " | " + menu.get(i).getDescription() + " | " + menu.get(i).getPrice() +"€" +"\n";
        }
        return initial;
    }
}
