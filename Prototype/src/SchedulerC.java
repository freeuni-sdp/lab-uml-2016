
public class SchedulerC {
	public static CloneableTime calculateEnd(CloneableTime start, int hours) throws CloneNotSupportedException {
		int hr = start.getHours() + hours;
		hr %= 24;
		CloneableTime endTime = start.cloneItself();
		endTime.setHours(hr);
		return endTime;
	}
}
