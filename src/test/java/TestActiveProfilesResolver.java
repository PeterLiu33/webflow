import org.springframework.test.context.ActiveProfilesResolver;

/**
 * Created by bavatinolab on 16/12/3.
 */
public class TestActiveProfilesResolver implements ActiveProfilesResolver {

    public String[] resolve(Class<?> testClass) {

        final String profile = System.getProperty("spring.profiles.active");

        return new String[]{profile == null? "test" : profile};
    }
}
