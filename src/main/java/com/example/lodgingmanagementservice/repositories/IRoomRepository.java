package com.example.lodgingmanagementservice.repositories;

import com.example.lodgingmanagementservice.models.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer>{
  
}
