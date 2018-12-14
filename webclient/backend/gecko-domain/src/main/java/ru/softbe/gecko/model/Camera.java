package ru.softbe.gecko.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Camera {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAMERA_SEQ")
    @SequenceGenerator(name = "CAMERA_SEQ", sequenceName = "CAMERA_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "ip", length = 100)
    private String ip;

    @Column(name = "port_rtsp")
    private Integer portRtsp;

    @Column(name = "port_web")
    private Integer portWeb;

    @Column(name = "link_rtsp", length = 512)
    private String linkRtsp;

    @Column(name = "pt2")
    private Boolean pt2 = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_created_id")
    private User userCreated;
}
