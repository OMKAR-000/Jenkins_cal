

/**
 * The `Extended` class in Java contains methods to calculate the square and cube of a given float
 * number.
 */
public class ExtendedCalculator {
    
   /**
    * The function calculates the square of a given float number.
    * 
    * @param operand_1 The `operand_1` parameter is a single floating-point number that represents the
    * value for which you want to calculate the square. The `square` function takes this number as
    * input and returns the square of that number as a floating-point result.
    * @return The function `square` is returning the square of the `operand_1` value.
    */
    float square(float operand_1)
    {
        return(operand_1*operand_1);
    }

   /**
    * The given Java function calculates the cube of a given float number.
    * 
    * @param operand_1 The parameter `operand_1` is a single floating-point number that represents the
    * value for which you want to calculate the cube.
    * @return The function `cube` is returning the cube of the `operand_1` value. It calculates the
    * cube by multiplying `operand_1` with itself three times.
    */
    float cube(float operand_1)
    {
        return(operand_1*operand_1*operand_1);
    }
}