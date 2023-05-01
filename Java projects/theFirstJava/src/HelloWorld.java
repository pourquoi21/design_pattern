public class HelloWorld {

    // Singleton
    // public static void main(String[] args){
    //     Singleton a = Singleton.getInstance();
    //     Singleton b = Singleton.getInstance();
    //     System.out.println(a.hashCode());
    //     System.out.println(b.hashCode());
    //     if(a == b){
    //         System.out.println(true);
    //     }
    // }

    // Factory
    public static void main(String[] args){
        Factory latte = CoffeeFactory.getCoffee("Latte", 4000);
        Factory ame = CoffeeFactory.getCoffee("Americano", 3000);
        System.out.println(latte);
        System.out.println(ame);
    };

    // Strategy (Payment system)
//     public static void main(String[] args){
//         ShoppingCart cart = new ShoppingCart();

//         Item A = new Item("Jay1", 100);
//         Item B = new Item("Jay2", 300);

//         cart.addItem(A);
//         cart.addItem(B);

//         // pay by NHCard
//         cart.pay(new NHCardStrategy("Jay@example.com", "jayjay"));

//         // pay by KAKAOCard
//         cart.pay(new KAKAOCardStrategy("Jay", "123456789", "123", "2502"));
//     }
}