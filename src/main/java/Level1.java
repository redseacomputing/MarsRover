public class Level1 {

    private final int MAXIMUM_POSITIVE_STEERING_ANGLE = 45;
    private final int MAXIMUM_NEGATIVE_STEERING_ANGLE = MAXIMUM_POSITIVE_STEERING_ANGLE * -1;

    public double calculateTurnRadiusFrom(double wheelBase, double steeringAngle){
        double inRadians = Math.toRadians(steeringAngle);
        return wheelBase / Math.sin(inRadians);
    }

}
