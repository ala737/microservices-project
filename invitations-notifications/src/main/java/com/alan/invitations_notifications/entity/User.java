package com.alan.invitations_notifications.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;



@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "username")
    private String username;
    @jakarta.persistence.Id
    private Long id;


}
