package Calculator_lab3.ver1;

public class operation {
	public String evaluate(String expression) {
	      char[] arr = expression.toCharArray();
	      String operand1 = "";
	      String operand2 = "";
	      String operator = "";
	      double result = 0;

	      for (int i = 0; i < arr.length; i++) {
	         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
	            if(operator.isEmpty()){
	               operand1 += arr[i];
	            }else{
	               operand2 += arr[i];
	            }
	         }  

	         if(arr[i] == '+' || arr[i] == '-' || arr[i] == 'x' || arr[i] == '/' || arr[i] == '%' ) {
	            operator += arr[i];
	         }
	      }

	      if (operator.equals("+"))
	         result = addition(Double.parseDouble(operand1), Double.parseDouble(operand2));
	      else if (operator.equals("-"))
	         result = subtraction(Double.parseDouble(operand1), Double.parseDouble(operand2));
	      else if (operator.equals("/"))
	         result = divition(Double.parseDouble(operand1), Double.parseDouble(operand2));
	      else if (operator.equals("%"))
	         result = reminder(Double.parseDouble(operand1), Double.parseDouble(operand2));
	      else if (operator.equals("x"))
	         result = multiplication(Double.parseDouble(operand1), Double.parseDouble(operand2)); 
	      
	      return operand1 + operator + operand2 + "=" +result;
	   }
	private static double addition(double firstNumber, double secondNumber) {
		   return (firstNumber+secondNumber);
	   }
	   
	private static double subtraction(double firstNumber, double secondNumber) {
		   return (firstNumber-secondNumber);
	   }
	   
	private static double multiplication(double firstNumber, double secondNumber) {
		   return (firstNumber*secondNumber);
	   }
	   
	private static double divition(double firstNumber, double secondNumber) {
		   return (firstNumber/secondNumber);
	   }
	   
	private static double reminder(double firstNumber, double secondNumber) {
		   return (firstNumber%secondNumber);
	   }
}
