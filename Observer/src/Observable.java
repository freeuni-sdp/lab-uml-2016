import java.util.HashSet;

// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Observable <TMessage>  implements IObservable<TMessage>
{
    private HashSet<IObserver<TMessage>> m_Observers = new HashSet<IObserver<TMessage>>();
    protected Observable() throws Exception {
        m_Observers = new HashSet<IObserver<TMessage>>();
    }

    public void subscribe(IObserver<TMessage> observer) throws Exception {
        boolean isOk = m_Observers.add(observer);
        if (!isOk)
            throw new ObserverSubscribtionException("Can not subscribe twice.");
         
    }

    public void unsubscribe(IObserver<TMessage> observer) throws Exception {
        boolean isOk = m_Observers.remove(observer);
        if (!isOk)
            throw new ObserverSubscribtionException("Already usubscribed or never subscribed.");
         
    }

    protected void notifyObservers(TMessage message) throws Exception {
        for (IObserver<TMessage> observer : m_Observers)
        {
            observer.onNotified(message);
        }
    }
}