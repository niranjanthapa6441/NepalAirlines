package com.FYP.BookingDetail.Passenger;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Data
@Builder
public class PassengerDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
}
