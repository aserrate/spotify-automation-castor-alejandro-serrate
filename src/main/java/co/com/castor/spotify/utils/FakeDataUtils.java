package co.com.castor.spotify.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.datafaker.Faker;

import static co.com.castor.spotify.constans.GeneralMessages.DOMAIN_TEST;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FakeDataUtils {

    static Faker faker = new Faker();

    public static String invalidEmail() {
        return (faker.credentials().username()).
                replaceAll("[^A-Za-z0-9]", "").concat(DOMAIN_TEST);
    }

    public static String randomPassword(int min,int max){
        return faker.credentials().password(min,max);
    }
}
