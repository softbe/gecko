package ru.softbe.gecko.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_ID_SEQ")
    @SequenceGenerator(name = "CATEGORY_ID_SEQ", sequenceName = "CATEGORY_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "parent_id")
    private Long parentCategory;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Camera> cameras;
}
