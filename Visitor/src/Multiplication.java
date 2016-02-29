// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Multiplication  extends BinaryOperator 
{
    public Multiplication(AlgebraicExpressions leftOperand, AlgebraicExpressions rightOperand) throws Exception {
        super(leftOperand, rightOperand);
    }

    protected void performVisit(IVisitor visitor) throws Exception {
        visitor.visitMultiplication(this);
    }

}


