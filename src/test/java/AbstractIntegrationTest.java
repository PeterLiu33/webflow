import hello.MessagePrinter;
import hello.TestApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ActiveProfilesResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bavatinolab on 16/12/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
@ContextConfiguration(classes = TestApplicationConfig.class)
@ActiveProfiles(resolver = TestActiveProfilesResolver.class)
public class AbstractIntegrationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void messageService() throws Exception {
        MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
