package get_foreignkey;

public class Getset_citizen {
	private static long citizenId;

	public static long getCitizenId() {
		return citizenId;
	}

	public static void setCitizenId(long citizenId) {
		Getset_citizen.citizenId = citizenId;
	}
}
