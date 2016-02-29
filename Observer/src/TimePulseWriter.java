// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimePulseWriter   implements IObserver<Date>
{
    public void onNotified(Date message) throws Exception {
    	DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    	System.out.printf("Pulse at: %s", df.format(message));
    }

}


