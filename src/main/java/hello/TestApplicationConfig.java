package hello;

import com.bavatinolab.stereotype.TestProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bavatinolab on 16/12/3.
 */
@Configuration
@ComponentScan
@TestProfile
public class TestApplicationConfig {

    @Bean
    MessageService mockMessageService(){
        return new MessageService() {
            public String getMessage() {
                return "this is a mock messageservice";
            }
        };
    }
}
