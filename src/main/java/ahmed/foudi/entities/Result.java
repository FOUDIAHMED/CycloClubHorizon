package ahmed.foudi.entities;


import jakarta.persistence.*;

import java.time.Duration;

@Entity
public class Result {

    @EmbeddedId
    CyclistStage Id;

    @Column(name = "rank")
    private int rank;

    @Column(name = "time")
    private Duration time;

    @ManyToOne
    @MapsId("cyclist_id")
    @JoinColumn(name = "cyclist_id")
    Cyclist cyclist;

    @ManyToOne
    @MapsId("stage_id")
    @JoinColumn(name = "stage_id")
    Stage stage;

    public Result() {

    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRank() {
        return rank;
    }
    public void setTime(Duration time) {
        this.time = time;
    }
    public Duration getTime() {
        return time;
    }
    public void setCyclist(Cyclist cyclist) {
        this.cyclist = cyclist;
    }
    public Cyclist getCyclist() {
        return cyclist;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public Stage getStage() {
        return stage;
    }




}
