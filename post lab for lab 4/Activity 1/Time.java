



public class Time implements Comparable<Time>, Cloneable {
	
		private long time;
	
		public Time() {
			this(System.currentTimeMillis()/1000);
		}
	
		public Time(long hour, long minute, long second) {
			this(hour * 3600L + minute * 60L + second );
		}
	
		public Time(long time) {
			this.time = time;
		}
	
		public int getHour() {
			return (int) ((time / 3600L) % 24);
		}
	
		public int getMinute() {
			return (int) ((time / 60L) % 60);
		}
	
		public int getSecond() {
			return (int) (time % 60);
		}
	
		public long getSeconds() {
			return time;
		}
	
		
		public String toString() {
			String s = "[";
			if (getHour() > 0) {
				s += getHour() + " hour" + (getHour() > 1 ? "s" : "") + " ";
			}
			if (getMinute() > 0) {
				s += getMinute() + " minute" + (getMinute() > 1 ? "s" : "") + " ";
			}
			if (getSecond() > 0) {
				s += getSecond() + " second" + (getSecond() > 1 ? "s" : "") + "]";
			}
			return s.trim();
		}
	
		
		public int compareTo(Time other) {
			return (int) (this.getSeconds() - other.getSeconds());
		}
	
		public Time clone() {
			try {
				return (Time) super.clone();
			} catch (CloneNotSupportedException ex) {
				return null;
			}
		}
	}
