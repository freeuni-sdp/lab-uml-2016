// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public interface IVisitor   
{
    void visitNumber(Number expression) throws Exception ;

    void visitNegation(Negation expression) throws Exception ;

    void visitAddition(Addition expression) throws Exception ;

    void visitSubstraction(Substraction expression) throws Exception ;

    void visitMultiplication(Multiplication expression) throws Exception ;

    void visitDivision(Division expression) throws Exception ;

}


