package com.example.campingontop.house.model.request;

import io.swagger.annotations.ApiParam;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostSetHouseImgDtoReq {
    @NotNull
    private MultipartFile img;
}
