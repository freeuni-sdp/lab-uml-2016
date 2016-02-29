// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public abstract class AlgebraicExpressions   
{
    public void accpet(IVisitor visitor) throws Exception {
        performVisit(visitor);
    }

    protected abstract void performVisit(IVisitor visitor) throws Exception ;

}


