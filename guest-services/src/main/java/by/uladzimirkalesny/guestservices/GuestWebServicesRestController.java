package by.uladzimirkalesny.guestservices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j

@RestController
@RequestMapping("/guests")
public class GuestWebServicesRestController {

    private final GuestRepository guestRepository;

    @GetMapping
    public Iterable<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @GetMapping("/{id}")
    public Guest getGuestById(@PathVariable Long id) {
        return guestRepository.findById(id).orElse(new Guest());
    }

}