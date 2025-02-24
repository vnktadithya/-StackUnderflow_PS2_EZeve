package solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import solution.model.Event;
import solution.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/events")
@CrossOrigin("*") // Allow frontend access
public class EventController {

    @Autowired
    private EventService eventService;

    // Save a new event
    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event) {
        return eventService.save(event); // ✅ Fixed method call
    }

    // Get all events
    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
