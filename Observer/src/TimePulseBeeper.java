// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

import java.util.Date;

public class TimePulseBeeper   implements IObserver<Date>
{
 
	@Override
	public void onNotified(Date message) throws Exception {
		// ASCII bell
	     System.out.print("\007");
	     System.out.flush();
	}

}


