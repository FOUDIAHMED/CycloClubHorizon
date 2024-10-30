package ahmed.foudi.entities.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable

public class CyclistStage implements Serializable {

    @Column(name = "cyclist_id")
    private Long cyclistId; // Changed from CyclistId

    @Column(name = "stage_id")
    private Long stageId;

}