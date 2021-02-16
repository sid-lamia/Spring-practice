package com.lamia.lil.learningspring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamia.lil.learningspring.data.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
