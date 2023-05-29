package homework_programs_week_4;

//    18. Sum Calculator

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
//   Method named getFirstNumber without any parameters, it needs to return the value of the
//  firstNumber field.
    public double getFirstNumber(){
        return firstNumber;
    }
//   Method named getSecondNumber without any parameters, it needs to return the value of
//   the secondNumber field.
    public double getSecondNumber(){
        return secondNumber;
    }
  //    Method named setFirstNumber with one parameter of type double, it needs to set the value
  //    of the firstNumber field.
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    //● *Method named setSecondNumber with one parameter of type double, it needs to set the
    //value of the secondNumber field
    public void setSecondNumber(double secondNumber){
        this.secondNumber= secondNumber;
    }
    // Method named getAdditionResult without any parameters, it needs to return the result of
    //adding the field values of firstNumber and secondNumber
    public double getAdditionResult (){

        return firstNumber + secondNumber;
    }

    // ● Method named getSubtractionResult without any parameters, it needs to return the result of
    //subtracting the field values of the secondNumber from the firstNumber.

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    // Method named getMultiplicationResult without any parameters, it needs to return the result
    //of multiplying the field values of firstNumber and secondNumber

    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    // Method named getDivisionResult without any parameters, it needs to return the result of
    //dividing the field values of firstNumber by the secondNumber. In case the value of
    //secondNumber is 0 then return 0.

    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
