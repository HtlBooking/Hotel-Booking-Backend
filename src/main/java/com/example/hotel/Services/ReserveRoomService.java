package com.example.hotel.Services;

import com.example.hotel.Entity.RoomCategory;
import com.example.hotel.Repository.ReserveRoomRepo;
import org.springframework.stereotype.Service;

@Service
public class ReserveRoomService {

    private final ReserveRoomRepo reserveRoomRepo;

    public ReserveRoomService(ReserveRoomRepo reserveRoomRepo) {
        this.reserveRoomRepo = reserveRoomRepo;
    }

    public RoomCategory addReservation(RoomCategory reserveRoom){
        return reserveRoomRepo.save(reserveRoom);
    }

//    public
}
