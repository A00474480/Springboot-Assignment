package com.sivleen.hotelreservation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "Hotel")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hotel_id;
    private String name;
    private String location;
    private BigDecimal price;
    private BigDecimal rating;
    private Integer total_rooms_available;
    private String contact_email;
    private String contact_phone;
    private String website;
}
