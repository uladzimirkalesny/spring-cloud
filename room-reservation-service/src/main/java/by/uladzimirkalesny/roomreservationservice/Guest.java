package by.uladzimirkalesny.roomreservationservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Guest {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;
}
