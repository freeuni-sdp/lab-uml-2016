// Computer assisted translation from c# by CS2J (http://www.cs2j.com)
// Original sources are published under Microsoft Public License (Ms-PL) at csharpdesignpatterns.codeplex.com
// (c) 2013 Jason Oliveira, George Mamaladze

public class Program {

	public static void main(String[] args) throws Exception {
	       TimePulseObservable pulseObservable = new TimePulseObservable(5);
	        System.out.println("························ Initialize time pulse with 5 seconds");
	        TimePulseWriter pulseWriter = new TimePulseWriter();
	        pulseObservable.subscribe(pulseWriter);
	        System.out.println("························ Subscribed pulse writer");
	        TimePulseBeeper pulseBeeper = new TimePulseBeeper();
	        pulseObservable.subscribe(pulseBeeper);
	        System.out.println("························ Subscribed pulse beeper");
	        System.out.println("························ Unmute speakers and wait 5 seconds ...");
	}
}
