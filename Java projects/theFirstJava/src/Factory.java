abstract class Factory {
    public abstract int getPrice();

    @Override
    public String toString(){
        return "Hi this coffee is " + this. getPrice();
    }
}

class CoffeeFactory {
    public static Factory getCoffee(String type, int price){
        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
        else {
        return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Factory {
    private int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Factory {
    private int price;

    public Latte(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}

class Americano extends Factory {
    private int price;

    public Americano(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}