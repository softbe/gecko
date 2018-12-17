package ru.softbe.gecko.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ID_SEQ")
    @SequenceGenerator(name = "USER_ID_SEQ", sequenceName = "USER_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_number", length = 100)
    private String phoneNumber;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @OneToMany(mappedBy = "userCreated", fetch = FetchType.LAZY)
    private Set<Camera> cameras;
}
