package by.uladzimirkalesny.roomreservationservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    private Long id;
    private Long roomId;
    private Long guestId;
    private Date date;
}
