package com.example.hotel.Repository;

import com.example.hotel.Entity.RoomCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRoomRepo extends JpaRepository<RoomCategory, String> {

}
