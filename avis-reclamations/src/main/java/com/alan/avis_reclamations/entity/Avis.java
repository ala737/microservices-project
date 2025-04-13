package com.alan.avis_reclamations.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="avis-reclamations")
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvis;

    @Column(name="user_Id")
    private Long userId;

    @Column(name="target_id")
    private Long targetId;

    @Column(name="comment")
    private String comment;

    @Min(1) @Max(5)
    @Column(name = "rating")
    private int rating;

    @Enumerated(EnumType.STRING)
    @Column(name="type")
    private TYPE_AVIS type;

    @Column(name="created_date")
    private Date creationDate;
}
