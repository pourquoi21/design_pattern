import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

interface Strategy{
    public void pay(int amount);
}

class KAKAOCardStrategy implements Strategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expireDate){
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expireDate;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using KAKAOCard.");
    }
}

class NHCardStrategy implements Strategy {
    private String emailId;
    private String password;

    public NHCardStrategy(String email, String pwd){
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using LUNACard.");
    }
}

class Item {
    private String name;
    private int price;
    public Item (String name, int cost){
        this.name = name;
        this.price = cost;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}

class ShoppingCart {
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(Strategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
