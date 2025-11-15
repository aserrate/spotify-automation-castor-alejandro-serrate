package co.com.castor.spotify.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EnvironmentUtils {
    public static String email() {
        return System.getenv("SPOTIFY_EMAIL");
    }
    public static String password() {
        return System.getenv("SPOTIFY_PASSWORD");
    }
}
