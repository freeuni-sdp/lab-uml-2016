// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Number  extends AlgebraicExpressions 
{
    public Number(int value) throws Exception {
        setValue(value);
    }

    private int __Value = 0;
    public int getValue() {
        return __Value;
    }

    public void setValue(int value) {
        __Value = value;
    }

    public void accpet(IVisitor visitor) throws Exception {
        visitor.visitNumber(this);
    }

    protected void performVisit(IVisitor visitor) throws Exception {
        visitor.visitNumber(this);
    }

}