package com.example.campingontop.house.repository;

import com.example.campingontop.house.model.House;
import com.example.campingontop.house.repository.QueryDsl.HouseRepositoryCustom;
import com.example.campingontop.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HouseRepository extends JpaRepository<House, Long>, HouseRepositoryCustom {
    public Optional<House> findByName(String name);

    List<House> findByStatusAndLatitudeBetweenAndLongitudeBetween(boolean status, double minLat, double maxLat, double minLon, double maxLon);
}
