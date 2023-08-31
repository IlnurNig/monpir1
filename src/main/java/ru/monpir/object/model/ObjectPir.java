package ru.monpir.object.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.monpir.documentationRd.model.DocumentationRd;
import ru.monpir.project.model.Project;

import java.util.Set;

@Entity
@Table(name = "object_pir")
@Getter
@Setter
public class ObjectPir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "project_id")
    @ToString.Exclude
    private Project project;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "objectPir")
    @ToString.Exclude
    private Set<DocumentationRd> documentationRds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_object_id", foreignKey = @ForeignKey(name = "fk_parent_id"))
    private ObjectPir parent;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_object_id")
    private Set<ObjectPir> children;
}
