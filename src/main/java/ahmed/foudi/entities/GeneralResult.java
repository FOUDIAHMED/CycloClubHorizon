package ahmed.foudi.entities;


import ahmed.foudi.entities.embeddable.GeneralResultKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;


@Getter
@Setter
@Entity
public class GeneralResult {
    @EmbeddedId
    GeneralResultKey id;

    @Column(name = "overall_time")
    private Duration overallTime;

    @Column(name = "overall_rank")
    private int overallRank;

    @ManyToOne()
    @JoinColumn(name = "CYCLIST_ID")
    @MapsId("cyclistId")
    private Cyclist cyclist;

    @ManyToOne()
    @JoinColumn(name = "COMPETITION_ID")
    @MapsId("competitionId")
    private Competition competition;

    public GeneralResult(){}


}
