package com.bsb.incubator.boot;

import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import org.junit.Test;

/**
 * @author Sebastien Gerard
 */
public class HelloApplicationTest extends AbstractBootFluentTest {

    @Test
    public void pageTitle() {
        goTo("http://localhost:8080");

        assertThat(find("#welcome", withText("Greetings from Spring Boot!"))).hasSize(1);
    }
}
