# Mars Rover

## Level 1

### Calculate the TurnRadius

Input: WheelBase SteeringAngle
Both values are floating point numbers (double)

Output: TurnRadius
TurnRadius = WheelBase / sin(SteeringAngle)

Example:
Input: 1.00 30.00
Output: 2.00

 ### Testcases
-[X] Return value should be a double with 2 comma separated values
-[X] The parameters of the function should be both double values 
-[X] The sinus of 30.00 should be 0.5
-[X] The result of input 1.00 30.00 should be 2.00

## Level 2 
### Calculate the position and direction
Input: WheelBase Distance SteeringAngle
all values are double datatypes

Output: x y Direction
3 floating point numbers rounded to two digits

Example:
Input: 1.00 1.00 30.00
Output: 0.24 0.96 28.65

### TestCases

-[ ] Should take three double parameters
-[ ] Should return three double parameters
-[ ] Should calculate x and y coordinates
-[ ] Should calculate direction of the mars rover ( 0 to 360 degrees )

