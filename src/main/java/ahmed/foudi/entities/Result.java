package ahmed.foudi.entities;


import ahmed.foudi.entities.embeddable.CyclistStage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
@Entity
public class Result {

    @EmbeddedId
    private CyclistStage Id;


    @ManyToOne
    @MapsId("cyclist_id")
    @JoinColumn(name = "cyclist_id")
    private Cyclist cyclist;

    @ManyToOne
    @MapsId("stage_id")
    @JoinColumn(name = "stage_id")
    private Stage stage;

    @Column(name = "rank")
    private int rank;

    @Column(name = "time")
    private Duration time;



    public Result() {

    }


}
