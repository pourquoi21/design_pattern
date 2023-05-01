abstract class Factory {
    public abstract int getPrice();
    public abstract String getName();

    @Override
    public String toString(){
        return "Hi " + this.getName() + " is " + this.getPrice();
    }
}

class CoffeeFactory {
    public static Factory getCoffee(String type, int price){
        if ("Latte".equalsIgnoreCase(type)) return new Latte(type, price);
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(type, price);
        else {
        return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Factory {
    private int price;
    private String name;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public String getName(){
        return this.name;
    }

}

class Latte extends Factory {
    private int price;
    private String name;

    public Latte(String type, int price){
        this.price = price;
        this.name = type;
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}

class Americano extends Factory {
    private int price;
    private String name;

    public Americano(String type, int price){
        this.price = price;
        this.name = type;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}