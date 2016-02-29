// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public abstract class BinaryOperator  extends AlgebraicExpressions 
{
    protected BinaryOperator(AlgebraicExpressions leftOperand, AlgebraicExpressions rightOperand) throws Exception {
        setLeftOperand(leftOperand);
        setRightOperand(rightOperand);
    }

    private AlgebraicExpressions __LeftOperand;
    public AlgebraicExpressions getLeftOperand() {
        return __LeftOperand;
    }

    public void setLeftOperand(AlgebraicExpressions value) {
        __LeftOperand = value;
    }

    private AlgebraicExpressions __RightOperand;
    public AlgebraicExpressions getRightOperand() {
        return __RightOperand;
    }

    public void setRightOperand(AlgebraicExpressions value) {
        __RightOperand = value;
    }

    public void accpet(IVisitor visitor) throws Exception {
        getLeftOperand().accpet(visitor);
        getRightOperand().accpet(visitor);
        super.accpet(visitor);
    }

}


