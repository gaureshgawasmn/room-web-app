package com.lil.sbet.roomwebapp.service;

import java.util.List;

import com.lil.sbet.roomwebapp.data.RoomRepository;
import com.lil.sbet.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id) {
       return roomRepository.findById(id).get();
    }
}