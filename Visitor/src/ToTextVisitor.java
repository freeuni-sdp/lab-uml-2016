// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

import java.util.Stack;

public class ToTextVisitor   implements IVisitor
{
    private Stack<String> m_TextStack = new Stack<String>();
    public ToTextVisitor() throws Exception {
        m_TextStack = new Stack<String>();
    }

    public void visitNumber(Number expression) throws Exception {
        m_TextStack.push(Integer.toString(expression.getValue()));
    }

    public void visitNegation(Negation expression) throws Exception {
        String text = m_TextStack.pop();
        String result = String.format("( -%s )", text);
        m_TextStack.push(result);
    }

    public void visitAddition(Addition expression) throws Exception {
        visitBinary("( %s + %s )");
    }

    public void visitSubstraction(Substraction expression) throws Exception {
        visitBinary("( %s - %s )");
    }

    public void visitMultiplication(Multiplication expression) throws Exception {
        visitBinary("%s * %s");
    }

    public void visitDivision(Division expression) throws Exception {
        visitBinary("%s / %s");
    }

    public String getResult() throws Exception {
        return m_TextStack.peek();
    }

    private void visitBinary(String formula) throws Exception {
        String textLeft = m_TextStack.pop();
        String textRight = m_TextStack.pop();
        String result = String.format(formula, textRight, textLeft);
        m_TextStack.push(result);
    }
}