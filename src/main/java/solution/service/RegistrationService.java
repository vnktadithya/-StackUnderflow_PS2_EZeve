package solution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solution.model.Registration;
import solution.repository.RegistrationRepository;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository repo;

    public Registration save(Registration registration) {
        return repo.save(registration);
    }

    public List<Registration> getAll() {
        return repo.findAll();
    }
    public List<Registration> getRegistrationsByEvent(Long eventId) {
        return repo.findByEventId(eventId);
    }

}
