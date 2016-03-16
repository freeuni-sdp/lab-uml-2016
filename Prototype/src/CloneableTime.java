
public abstract class CloneableTime implements Cloneable {
	public abstract void setTime(int hr, int min, int sec);
	public abstract void setHours(int hr);
	public abstract int getHours();
	public abstract int getMinutes();
	public abstract int getSeconds();

	public CloneableTime cloneItself() throws CloneNotSupportedException {
		return (CloneableTime) super.clone();
	}
}
