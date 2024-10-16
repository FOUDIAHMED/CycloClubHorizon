package ahmed.foudi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class GeneralResultKey implements Serializable {
        @Column(name = "cyclist_id")
        Long CyclistId;

        @Column(name = "competition_id")
        Long StageId;
}
