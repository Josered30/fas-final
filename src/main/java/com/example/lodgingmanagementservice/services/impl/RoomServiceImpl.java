package com.example.lodgingmanagementservice.services.impl;

import java.util.List;
import java.util.Optional;

import com.example.lodgingmanagementservice.models.Room;
import com.example.lodgingmanagementservice.repositories.IRoomRepository;
import com.example.lodgingmanagementservice.services.IRoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements IRoomService{

  @Autowired
  private IRoomRepository roomRepository;

  @Override
  public Room save(Room t) throws Exception {
    return roomRepository.save(t);
  }

  @Override
  public void deleteById(Integer id) throws Exception {
    roomRepository.deleteById(id);    
  }

  @Override
  public Optional<Room> findById(Integer id) throws Exception {
    return roomRepository.findById(id);
  }

  @Override
  public List<Room> findAll() throws Exception {
    return roomRepository.findAll();
  }
  
}
