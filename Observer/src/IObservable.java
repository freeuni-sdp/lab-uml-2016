// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public interface IObservable <TMessage>  
{
    void subscribe(IObserver<TMessage> observer) throws Exception ;

    void unsubscribe(IObserver<TMessage> observer) throws Exception ;

}


