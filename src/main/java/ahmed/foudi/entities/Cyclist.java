package ahmed.foudi.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Cyclist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName ;

    @Column(name = "LAST_NAME")
    private String lastName ;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "AGE")
    private int age;

    @Column(name ="team")
    private String team;

    @OneToMany(mappedBy = "cyclist")
    private List<Result> results;
}
