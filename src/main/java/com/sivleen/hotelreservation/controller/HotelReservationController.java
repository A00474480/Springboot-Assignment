package com.sivleen.hotelreservation.controller;

import com.sivleen.hotelreservation.entity.Hotel;
import com.sivleen.hotelreservation.service.HotelReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelReservationController {
    @Autowired
    private HotelReservationService hotelReservationService;

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotels = hotelReservationService.getAllHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel newHotel) {
        try {
            Hotel savedHotel = hotelReservationService.addHotel(newHotel);
            return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);
        } catch (ResponseStatusException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to add hotel", ex);
        }
    }
}