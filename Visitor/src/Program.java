
public class Program {

	public static void main(String[] args) throws Exception {
        //"( ( 3 + 5 * 2 / 6 ) - 8 )"
        Substraction expression = new Substraction(new Addition(new Number(3),new Multiplication(new Number(5),new Division(new Number(2),new Number(6)))),new Number(8));
        ToTextVisitor textVisitor = new ToTextVisitor();
        expression.accpet(textVisitor);
        String expressionText = textVisitor.getResult();
        System.out.println(expressionText);
        
        ToValueVisitor valueVisitor = new ToValueVisitor();
        expression.accpet(valueVisitor);
        int value = valueVisitor.getResult();
        System.out.println(value);
	}

}
