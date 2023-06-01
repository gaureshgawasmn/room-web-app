package com.lil.sbet.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import com.lil.sbet.roomwebapp.data.StaffRepository;
import com.lil.sbet.roomwebapp.models.Position;
import com.lil.sbet.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}