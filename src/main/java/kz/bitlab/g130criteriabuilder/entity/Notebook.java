package kz.bitlab.g130criteriabuilder.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "NOTEBOOKS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private Double price;

    @Column(name = "BRAND", nullable = false)
    private String brand;

    @Column(name = "PROCESSOR")
    private String processor;

    @Column(name = "RAM")
    private String ram;

    @Column(name = "MEMORY")
    private String memory;

    @Column(name = "OS")
    private String os;
}
