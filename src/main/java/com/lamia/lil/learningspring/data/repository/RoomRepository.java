package com.lamia.lil.learningspring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamia.lil.learningspring.data.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
	

}
