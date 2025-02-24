package solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class EventbriteService {

    @Autowired
    private EventbriteConfig eventbriteConfig;

    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, Object> fetchUserDetails() {
        String url = eventbriteConfig.getApiUrl() + "users/me/";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + eventbriteConfig.getApiKey());

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, entity, Map.class);
        return response.getBody();
    }
}
