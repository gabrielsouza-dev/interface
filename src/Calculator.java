//Defines Calculator as responsible for implementing MathematicalOperation methods
class Calculator implements MathematicalOperation {

    //The responsibility for implementing interface methods is usually the responsibility of those who will use their methods
    @Override
    public void sum(double factor, double factor1) {
        System.out.println("Sum: " + (factor + factor1));
    }

    @Override
    public void subtraction(double factor2, double factor3) {
        System.out.println("Subtraction: " + (factor2 - factor3));
    }

    @Override
    public void multiplication(double factor4, double factor5) {
        System.out.println("Multiplication: " + (factor4 * factor5));
    }

    @Override
    public void division(double factor6, double factor7) {
        System.out.println("Division: " + (factor6 / factor7));
    }

}