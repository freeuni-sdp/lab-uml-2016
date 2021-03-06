// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Negation  extends UnaryOperator 
{
    public Negation(AlgebraicExpressions operand) throws Exception {
        super(operand);
    }

    protected void performVisit(IVisitor visitor) throws Exception {
        visitor.visitNegation(this);
    }

}


