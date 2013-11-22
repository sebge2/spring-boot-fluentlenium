package be.sgerard.incubator.boot;

import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.*;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import org.junit.Test;

/**
 * @author Sebastien Gerard
 */
public class HelloApplicationTest extends AbstractBootFluentTest {

    @Test
    public void pageTitle() {
        goTo(getServerUrl() + "/");

        assertThat(find("#welcome", withText("Greetings from Spring Boot!"))).hasSize(1);
    }
}
