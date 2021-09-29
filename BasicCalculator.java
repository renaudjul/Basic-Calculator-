public class Calculator{

    public Calculator(){
  }
    public int add(int a, int b){
      
        int addParameters = a + b;
        return addParameters; 
  }
    public int subtract(int a, int b){
      
        int subParameters = a - b;
        return subParameters;
  }
    public int multiply(int a, int b){
      
        int multiplyParameters = a * b;
        return multiplyParameters;
  }
    public int divide(int a, int b){
      
        int divideParameters = a / b;
        return divideParameters; 
  }
    public int modulo(int a, int b){
      
        int moduloParameters = a % b;
        return moduloParameters; 
  }
public static void main(String [] args){
  
      Calculator myCalculator = new Calculator();

      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));
      System.out.println(myCalculator.multiply(8,9));
      System.out.println(myCalculator.divide(63, 9));
      System.out.println(myCalculator.modulo(10,3));
}
}
