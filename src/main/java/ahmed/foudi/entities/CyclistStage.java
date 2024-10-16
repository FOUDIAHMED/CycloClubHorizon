package ahmed.foudi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
class CyclistStage implements Serializable {

    @Column(name = "cyclist_id")
    Long CyclistId;

    @Column(name = "stage_id")
    Long StageId;

}