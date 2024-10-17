package ahmed.foudi.entities.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Embeddable
public class GeneralResultKey implements Serializable {
        @Column(name = "CYCLIST_ID")
        private Long cyclistId;

        @Column(name = "COMPETITION_ID")
        private Long competitionId;


        public GeneralResultKey() {}


}

