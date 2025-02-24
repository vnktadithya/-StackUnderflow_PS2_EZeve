package solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solution.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
