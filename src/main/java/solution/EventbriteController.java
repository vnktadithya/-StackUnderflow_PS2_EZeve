package solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/eventbrite")
public class EventbriteController {

    @Autowired
    private EventbriteService eventbriteService;

    @GetMapping("/user")
    public Map<String, Object> getUserDetails() {
        return eventbriteService.fetchUserDetails();
    }
}
