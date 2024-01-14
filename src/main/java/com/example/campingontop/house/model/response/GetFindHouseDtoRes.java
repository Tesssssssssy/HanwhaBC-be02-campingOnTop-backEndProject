package com.example.campingontop.house.model.response;

import com.example.campingontop.house.model.House;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetFindHouseDtoRes {
    private Long id;

    // private Integer user_id;

    private String name;
    private String content;
    private Integer price;

    private String address;
    private String latitude;
    private String longitude;

    private Integer maxUser;

    private Boolean hasAirConditioner;
    private Boolean hasWashingMachine;

    public static GetFindHouseDtoRes toDto(House house) {
        return GetFindHouseDtoRes.builder()
                .id(house.getId())
                .name(house.getName())
                .content(house.getContent())
                .price(house.getPrice())
                .address(house.getAddress())
                .latitude(house.getLatitude())
                .longitude(house.getLongitude())
                .maxUser(house.getMaxUser())
                .hasAirConditioner(house.getHasAirConditioner())
                .hasWashingMachine(house.getHasWashingMachine())
                .build();
    }
}
