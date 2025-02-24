package solution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;

@Configuration
@Getter
public class EventbriteConfig {

    @Value("${eventbrite.api.key}")
    private String apiKey;

    @Value("${eventbrite.api.url}")
    private String apiUrl;
}