import java.math.BigDecimal;
import java.math.RoundingMode;

public class Level2 {

    private final double MAXIMUM_POSITIVE_STEERING_ANGLE = 45d;
    private final double MAXIMUM_NEGATIVE_STEERING_ANGLE = MAXIMUM_POSITIVE_STEERING_ANGLE * -1;
    private final double IMPOSSIBLE_STEERING_ANGLE_TO_CALCULATE = 0d;

    public double calculateNewDirectionFrom(double wheelBase, double distance, double steeringAngle) {
        double radius = calculateTurnRadiusFrom(wheelBase, steeringAngle);
        if(radius == IMPOSSIBLE_STEERING_ANGLE_TO_CALCULATE) return 0d;
        double newDirection = (distance * 360) / (2 * radius * Math.PI);
        if (newDirection > 0) {
            while (newDirection > 360) {
                newDirection -= 360;
            }
        }
        if (newDirection < 0) {
            while (newDirection < -360) {
                newDirection += 360;
            }
        }
        return roundResult(newDirection, 2);
    }

    public double calculateYCoordinatesFrom(double wheelBase, double distance, double steeringAngle) {
        double radius = calculateTurnRadiusFrom(wheelBase, steeringAngle);
        if(radius == IMPOSSIBLE_STEERING_ANGLE_TO_CALCULATE) return distance;
        double newDirection = (distance * 360) / (2 * radius * Math.PI);
        double betaInDegrees = Math.abs(newDirection + 90d - 180d);
        double yCoordinate = Math.cos(Math.toRadians(betaInDegrees)) * radius;
        return roundResult(yCoordinate, 2);
    }

    public double calculateXCoordinatesFrom(double wheelBase, double distance, double steeringAngle) {
        double radius = calculateTurnRadiusFrom(wheelBase, steeringAngle);
        if(radius == IMPOSSIBLE_STEERING_ANGLE_TO_CALCULATE) return 0d;
        double xCoordinate = roundResult(Math.sqrt(Math.pow(radius, 2) - Math.pow(calculateYCoordinatesFrom(wheelBase, distance, steeringAngle), 2)) - radius, 2);
        return Math.abs(xCoordinate);
    }

    private double calculateTurnRadiusFrom(double wheelBase, double steeringAngle) {
        if (steeringAngle == IMPOSSIBLE_STEERING_ANGLE_TO_CALCULATE) return 0d;
        double inRadians = Math.toRadians(steeringAngle);
        return roundResult((wheelBase / Math.sin(inRadians)), 2);
    }

    private double roundResult(double value, int places) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}