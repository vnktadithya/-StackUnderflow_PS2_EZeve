package solution.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ensure MySQL works properly
    private Long id;
    private String topicName;
    private String description;
    private String RoomNumber;
    private String location;
    private LocalDate date;
    private Time starttime;
    private Time endtime;
    private int totalMembers;
    private String involvedParticipants;
    private String ChiefGuestName;

}
