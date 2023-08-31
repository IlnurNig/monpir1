package ru.monpir.documentationPd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.monpir.project.model.Project;

@Entity
@Table(name = "documentation_pd")
@Getter
@Setter
public class DocumentationPd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documentation_pd_id")
    private long id;

    @Enumerated(EnumType.STRING)
    private Stamp stamp;

    @Column(name = "number")
    private Long number;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "project_id")
    @ToString.Exclude
    private Project project;
}
