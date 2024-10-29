package ahmed.foudi.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "startLocation")
    private String startLocation;

    @Column(name = "endLocation")
    private String endLocation;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition ;

    @OneToMany(mappedBy = "stage")
    private List<Result> results;

    public Stage(){};



}
