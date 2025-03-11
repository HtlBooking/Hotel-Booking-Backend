package com.example.hotel.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "industryHotels")
public class AddHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    private String hotelName;

    @NotBlank
    private String location;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Min(value = 8)
    private String password;

    @NotBlank
    private String about;

    @NotBlank
    private String phone;

    @ElementCollection
    @NotBlank
    private List<String> services;

    @NotBlank
    private List<RoomCategory> roomCategories;

    @NotBlank
    private String image;
//    private

//    ------img
//    @NotBlank
//    private String fileName;
//
//    @NotBlank
//    private String filePath;

//    -----------img end


}
