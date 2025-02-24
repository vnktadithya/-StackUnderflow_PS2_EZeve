package solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import solution.model.Event;
import solution.model.Registration;
import solution.service.EventService;
import solution.service.RegistrationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private EventService eventService;

    @PostMapping("/register")
    public Registration register(@RequestBody Registration registration) {
        Optional<Event> eventOpt = eventService.getEventById(registration.getEvent().getId());

        if (eventOpt.isPresent()) {
            registration.setEvent(eventOpt.get()); // Ensure event is properly linked
            return registrationService.save(registration);
        } else {
            throw new RuntimeException("Event not found");
        }
    }
    @GetMapping("/all")
    public List<Registration> getAllRegistrations() {
        return registrationService.getAll(); // Ensures event details are included
    }

    @GetMapping("/event/{eventId}")
    public List<Registration> getRegistrationsByEvent(@PathVariable Long eventId) {
        return registrationService.getRegistrationsByEvent(eventId);
    }

}
