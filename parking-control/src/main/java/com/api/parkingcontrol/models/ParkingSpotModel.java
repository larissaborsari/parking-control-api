package com.api.parkingcontrol.models;

import org.hibernate.validator.constraints.Currency;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="TB_PARKING-SPOT")

public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //inserindo um identificador para a classe principal
    @GeneratedValue(strategy = GenerationType.AUTO)//id é gerado de forma automática
    private UUID id; // do tipo UUID por ser único, universal, pode ser gerado em qualquer lugar, diminui o
    //risco de gerar conflitos dentro da arquitetura
    @Column(nullable = false, unique = true, length = 10) //nullable=false -> o campo não pode ser nulo;
    // unique=true não pode ter valor repetido, só valor único
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;
}
