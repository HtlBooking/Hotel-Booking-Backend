package com.example.hotel.Controller;

import com.example.hotel.Entity.RoomCategory;
import com.example.hotel.Services.ReserveRoomService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/auth")
public class ReserveRoomCon {

    private final ReserveRoomService reserveRoomService;


    public ReserveRoomCon(ReserveRoomService reserveRoomService) {
        this.reserveRoomService = reserveRoomService;
    }

    @PostMapping("/addRoomReservetion")
    public RoomCategory addReserveRoom(@RequestBody RoomCategory reserveRoom){
        return reserveRoomService.addReservation(reserveRoom);
    }
}
