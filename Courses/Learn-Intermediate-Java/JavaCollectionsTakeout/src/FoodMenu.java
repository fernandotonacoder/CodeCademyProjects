import java.util.*;

public class FoodMenu {

    private LinkedList<Food> menu;

    public FoodMenu() {

        menu = new LinkedList<>();
        Food pasta = new Food("Pasta", "Italian traditional pasta", 10);
        Food pizza = new Food("Pizza", "Genuine Italian pizza", 12);
        Food caldoVerde = new Food("Caldo verde", "Portuguese traditional soup", 4);
        menu.add(pasta);
        menu.add(pizza);
        menu.add(caldoVerde);
    }

    public Food getFood(int index) throws IndexOutOfBoundsException {
         int realIndex = index -1;
        if(realIndex > menu.size() || realIndex < 0){
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
