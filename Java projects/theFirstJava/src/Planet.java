public class Planet {
    void revolve() {
        System.out.println("Revolve");
    }

    public static void main(String[] args){
        Planet earth = new Planet();
        Planet venus = new Planet();
    
        venus.revolve();
    }
}


