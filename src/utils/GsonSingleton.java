package utils;

import com.google.gson.Gson;

public class GsonSingleton {
	private static Gson gson = null;

	public static Gson getGson() {
		if (gson == null) {
			gson = new Gson();
		}
		return gson;
	}

}