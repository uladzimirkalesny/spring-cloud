package by.uladzimirkalesny.reservationservices;

import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findAllByDate(Date date);
}
