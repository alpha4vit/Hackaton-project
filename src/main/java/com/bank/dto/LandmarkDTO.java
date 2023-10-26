package com.bank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Landmark DTO")
public class LandmarkDTO {

    @Schema(name = "Landmark id", example = "1")
    private Long id;
    @Schema(name = "Landmark title", example = "This is the name of the landmark")
    private String title;
    @Schema(name = "Landmark description", example = "This is the description of the landmark")
    private String description;
    @Schema(name = "Landmark address")
    private AddressDTO address;
    @Schema(name = "Landmark rating", example = "3.23")
    private Double rating;
    @Schema(name = "Landmark reviews", example = "This is the name of the landmark")
    private List<ReviewLandmarkDTO> reviews;

}
