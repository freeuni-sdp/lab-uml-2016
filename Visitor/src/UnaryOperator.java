// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public abstract class UnaryOperator  extends AlgebraicExpressions 
{
    protected UnaryOperator(AlgebraicExpressions operand) throws Exception {
        setOperand(operand);
    }

    private AlgebraicExpressions __Operand;
    public AlgebraicExpressions getOperand() {
        return __Operand;
    }

    public void setOperand(AlgebraicExpressions value) {
        __Operand = value;
    }

    public void accpet(IVisitor visitor) throws Exception {
        getOperand().accpet(visitor);
        super.accpet(visitor);
    }

}


