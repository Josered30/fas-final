package com.example.lodgingmanagementservice.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.lodgingmanagementservice.models.Room;
import com.example.lodgingmanagementservice.services.IRoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/rooms")
public class RoomController {

  private final IRoomService roomService;

  public RoomController(IRoomService roomService){
    this.roomService = roomService;
  }


  @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> findAllRooms() throws Exception {
    List<Room> rooms = roomService.findAll();

    return new ResponseEntity<>(rooms, HttpStatus.OK);
  }

  @GetMapping(value = "/{roomId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> findRoomById(@PathVariable(value = "roomId") int roomId) throws Exception {
    Room room = roomService.findById(roomId).get();
    return new ResponseEntity<>(room, HttpStatus.OK);

  }

  @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> insertRoom(@RequestBody Room room) throws Exception {
    Room getRoom = roomService.save(room);

    return new ResponseEntity<>(getRoom, HttpStatus.OK);
  }

  @DeleteMapping(value = "/{roomId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> deleteRoomById(@PathVariable(value = "roomId") int roomId) throws Exception {
    Room getRoom = roomService.findById(roomId).get();
    roomService.deleteById(roomId);

    return new ResponseEntity<>(getRoom, HttpStatus.OK);
  }

}
