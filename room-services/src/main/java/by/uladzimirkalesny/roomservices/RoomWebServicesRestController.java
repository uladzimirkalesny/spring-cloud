package by.uladzimirkalesny.roomservices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j

@RestController
@RequestMapping("/rooms")
public class RoomWebServicesRestController {

    private final RoomRepository repository;

    @GetMapping
    public Iterable<Room> getAllRooms() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable long id) {
        return this.repository.findById(id).orElse(new Room());
    }
}
