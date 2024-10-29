package ahmed.foudi.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;


    @OneToMany(mappedBy = "cyclist", fetch = FetchType.EAGER)
    private List<Result> results;

}
