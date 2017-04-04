package devslp.designpatterns.strategy;

public class PointsStrategy implements PaymentStrategy {
    private int points;

    public PointsStrategy(int points) {
        this.points = points;
    }

    @Override
    public int pay(int amount) {
        int total = points*3;
        System.out.println("Puntos disponibles: " + points);
        System.out.println("Pago total: $" + amount + ".00");
        if(total >= amount) {
            total -= amount;
            points = total/3;
            System.out.print("Punto restantes:" + points);
            return amount;
        }else {
            points = amount/3;
            System.out.println("Puntos insuficientes");
            System.out.print("Se necesitan almenos: " + points + " Puntos");
            return total;
        }
    }
}
