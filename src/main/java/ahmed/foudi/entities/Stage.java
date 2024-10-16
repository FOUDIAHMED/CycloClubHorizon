package ahmed.foudi.entities;


import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NUMBER")
    private int number;

    @Getter
    @Column(name = "START_LOCATION")
    private String startLocation;

    @Getter
    @Column(name = "END_LOCATION")
    private String endLocation;

    @Getter
    @Column(name = "TYPE")
    private String type;

    @Getter
    @ManyToOne
    private Competition competition ;

    @Getter
    @OneToMany(mappedBy = "stage")
    private List<Result> results;

    public Stage(){};

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }


    public void setId(Long id) {
        this.id = id;
    }

}
