package com.example.hotel.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;

public class RoomBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    private RoomCategory roomType;

    private String hot_id;

    @Email
    @NotBlank
    private String customerEmail;

    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",message = "Must be date format")
    private String checkInDate;

    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",message = "Must be date format")
    private String checkOutDate;

    @NotBlank
    @Min(value = 1,message = "Must be 1 or more")
    @Pattern(regexp = "\\d+",message = "Must be number format")
    private String adults;

    @NotBlank
    @Min(value = 1,message = "Must be 1 or more")
    @Pattern(regexp = "\\d+",message = "Must be number format")
    private String children;

}
