package com.example.lodgingmanagementservice.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
public class Room {
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "level")
	private int level;

  @Column(name = "price")
  private double price;

  @Column(name = "aviable")
  private boolean avaiable;

}
