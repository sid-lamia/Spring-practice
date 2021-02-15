package com.lamia.lil.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lamia.lil.learningspring.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	

}
