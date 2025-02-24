package solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solution.model.Registration;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByEventId(Long eventId);
}
