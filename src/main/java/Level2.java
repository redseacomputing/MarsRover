import java.math.BigDecimal;
import java.math.RoundingMode;

public class Level2 {

    private final int MAXIMUM_POSITIVE_STEERING_ANGLE = 45;
    private final int MAXIMUM_NEGATIVE_STEERING_ANGLE = MAXIMUM_POSITIVE_STEERING_ANGLE * -1;

    private double calculateTurnRadiusFrom(double wheelBase, double steeringAngle) {
        double inRadians = Math.toRadians(steeringAngle);
        return roundResult((wheelBase / Math.sin(inRadians)), 2);
    }

    public double calculateNewDirectionFrom(double wheelBase, double distance, double steeringAngle){
        double radius = calculateTurnRadiusFrom(wheelBase, steeringAngle);
        double newDirection = (distance * 360) / (2 * radius * Math.PI);
        return roundResult(newDirection,2);
    }

    private double roundResult(double value, int places) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }



}
