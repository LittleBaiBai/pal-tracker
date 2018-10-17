package test.pivotal.pal.trackerapi;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeApiTest extends BaseApiTest {

    @Test
    public void exampleTest() {
        String body = restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello from test");
    }
}
