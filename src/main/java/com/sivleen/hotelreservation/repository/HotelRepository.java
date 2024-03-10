package com.sivleen.hotelreservation.repository;

import com.sivleen.hotelreservation.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
