package solution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solution.model.Event;
import solution.repository.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    // Fetch all events
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // ✅ Fetch event by ID (Fix for your issue)
    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    // Save an event
    public Event save(Event event) {
        return eventRepository.save(event);
    }
}
