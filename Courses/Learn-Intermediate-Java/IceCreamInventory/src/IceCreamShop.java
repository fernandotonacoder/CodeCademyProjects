import java.util.Scanner;

class ShopItems {
    int totalCount;

    class NonVegan {

        int iceCreamCount;
        int shakeCount;
        int totalCount;

        public void increaseCount(int iceCreamCount, int shakeCount) {
            this.iceCreamCount = iceCreamCount;
            this.shakeCount = shakeCount;
            if (iceCreamCount > 0) {
                this.totalCount += iceCreamCount;
                ShopItems.this.totalCount += iceCreamCount;
            } else if (shakeCount > 0) {
                this.totalCount += shakeCount;
                ShopItems.this.totalCount += shakeCount;
            }
        }
    }

    class Vegan {

        int smoothieCount;
        int slushieCount;
        int totalCount;

        public void increaseCount(int smoothieCount, int slushieCount) {
            this.smoothieCount = smoothieCount;
            this.slushieCount = slushieCount;
            if (smoothieCount > 0) {
                this.totalCount += smoothieCount;
                ShopItems.this.totalCount += smoothieCount;
            } else if (slushieCount > 0) {
                this.totalCount += slushieCount;
                ShopItems.this.totalCount += slushieCount;
            }

        }
    }
}

public class IceCreamShop {

    public static void main(String[] args) {
        int orderType = 0;
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        String itemName;

        ShopItems items = new ShopItems();
        ShopItems.NonVegan nonVegan = items.new NonVegan();
        ShopItems.Vegan vegan = items.new Vegan();

        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order. For ice-cream type 1, for shakes type 2, for smoothies type 3, and for slushies type 4. If you are done ordering type 0.");
        orderType = input.nextInt();

        while(orderType != 0) {
            System.out.println("How many items of this item would you like to order?");
            itemCount = input.nextInt();
            if(orderType == 1){
                itemName = "ice cream";
                nonVegan.increaseCount(itemCount, 0);
            } else if(orderType == 2) {
                itemName = "shake";
                nonVegan.increaseCount(0, itemCount);
            } else if(orderType == 3) {
                itemName = "smoothie";
                vegan.increaseCount(itemCount, 0);
            } else if(orderType == 4) {
                itemName = "slushie";
                vegan.increaseCount(0, itemCount);
            } else {
                break;
            }

            System.out.println("Adding " + itemCount + " of the item "+ itemName + " to your order!");

            System.out.println("Type a number for the next item in your order:\n1: Ice cream\n2: Shake\n3: Smoothie\n4: Slushie\n");
            orderType = input.nextInt();
        }
        System.out.println("Thank you for your order! Today we have sold " + items.totalCount + " orders of sweetness!");

        System.out.println(nonVegan.totalCount + " items have been ice cream and shakes.");

        System.out.println(vegan.totalCount + " items have been have been smoothies and slushies.");
    }
}