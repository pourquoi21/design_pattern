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
        System.out.println("Factory Latte :: " + latte);
        System.out.println("Factory Ame :: " + ame);
    }
}