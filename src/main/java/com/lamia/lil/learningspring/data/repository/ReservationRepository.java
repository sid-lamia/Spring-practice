package com.lamia.lil.learningspring.data.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamia.lil.learningspring.data.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	Iterable<Reservation> findReservationByReservationDate(Date date);

}
