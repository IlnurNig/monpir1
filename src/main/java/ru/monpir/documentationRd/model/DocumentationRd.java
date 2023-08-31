package ru.monpir.documentationRd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.monpir.object.model.ObjectPir;

@Entity
@Table(name = "documentation_rd")
@Getter
@Setter
public class DocumentationRd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documentation_rd_id")
    private long id;

    @Enumerated(EnumType.STRING)
    private Stamp stamp;

    @Column(name = "number")
    private Long number;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "object_id")
    @ToString.Exclude
    private ObjectPir objectPir;
}
