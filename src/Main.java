public class Main {
    public static void main(String[] args) {

        int ticketPrice = 7_000;
        int oneBonusMilli = 20;

        int accruedMiles = (ticketPrice / oneBonusMilli);
        System.out.println("Начислено бонусов: " + accruedMiles);
    }
}
