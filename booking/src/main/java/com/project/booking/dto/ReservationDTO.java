package com.project.booking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.booking.entities.Chambre;
import com.project.booking.entities.Client;
import com.project.booking.entities.Preference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {


    @JsonProperty("date_debut")
    private String dateDebut;

    @JsonProperty("date_fin")
    private String dateFin;

    @JsonProperty("client_id")
    private Long clientId;

    @JsonProperty("chambre_id")
    private Long chambreId;

    @JsonProperty("preferences")
    private List<PreferenceDTO> preferences = new ArrayList<>();
}
