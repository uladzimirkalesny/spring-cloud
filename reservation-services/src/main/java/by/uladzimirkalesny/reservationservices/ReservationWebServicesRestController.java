package by.uladzimirkalesny.reservationservices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j

@RestController
@RequestMapping("/reservations")
public class ReservationWebServicesRestController {

    private final ReservationRepository reservationRepository;

    @GetMapping
    public Iterable<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationRepository.findById(id).orElse(new Reservation());
    }

}