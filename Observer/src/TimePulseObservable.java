// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimePulseObservable  extends Observable<Date> 
{
    public TimePulseObservable(int seconds) throws Exception {
    	final TimePulseObservable observable = this;
    	Timer timer = new Timer();
    	timer.scheduleAtFixedRate(new TimerTask() {
    		  @Override
    		  public void run()  {
    			  try {
					observable.notifyObservers(new Date());
				} catch (Exception e) {
					e.printStackTrace();
				}
    		  }
    		}, seconds*1000, seconds*1000);
    }

}


