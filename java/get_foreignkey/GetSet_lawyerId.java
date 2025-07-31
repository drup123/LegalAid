package get_foreignkey;

public class GetSet_lawyerId {
	private static long lawyerid;

	public static long getLawyerid() {
		return lawyerid;
	}

	public static void setLawyerid(long lawyerid) {
		GetSet_lawyerId.lawyerid = lawyerid;
	}
}
