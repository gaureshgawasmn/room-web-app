package com.lil.sbet.roomwebapp.data;

import com.lil.sbet.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
