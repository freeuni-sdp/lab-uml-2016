// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

import java.util.Stack;

public class ToValueVisitor   implements IVisitor
{
    private Stack<Integer> m_OperandStack = new Stack<Integer>();
    public ToValueVisitor() throws Exception {
        m_OperandStack = new Stack<Integer>();
    }

    public void visitNumber(Number expression) throws Exception {
        m_OperandStack.push(expression.getValue());
    }

    public void visitNegation(Negation expression) throws Exception {
        int operand = m_OperandStack.pop();
        int result = -operand;
        m_OperandStack.push(result);
    }

    public void visitAddition(Addition expression) throws Exception {
    	 int rightOperand = m_OperandStack.pop();
         int leftOperand = m_OperandStack.pop();
         int result =  leftOperand + rightOperand;
         m_OperandStack.push(result);
    }

    public void visitSubstraction(Substraction expression) throws Exception {
    	 int rightOperand = m_OperandStack.pop();
         int leftOperand = m_OperandStack.pop();
         int result =  leftOperand - rightOperand;
         m_OperandStack.push(result);
    }

    public void visitMultiplication(Multiplication expression) throws Exception {
    	 int rightOperand = m_OperandStack.pop();
         int leftOperand = m_OperandStack.pop();
         int result =  leftOperand * rightOperand;
         m_OperandStack.push(result);
    }

    public void visitDivision(Division expression) throws Exception {
    	 int rightOperand = m_OperandStack.pop();
         int leftOperand = m_OperandStack.pop();
         int result =  leftOperand / rightOperand;
         m_OperandStack.push(result);    }
  
    public int getResult() throws Exception {
        return m_OperandStack.peek();
    }

}


