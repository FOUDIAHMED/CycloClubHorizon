package ahmed.foudi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GeneralResultKey implements Serializable {
        @Column(name = "CYCLIST_ID")
        private Long cyclistId;

        @Column(name = "COMPETITION_ID")
        private Long competitionId;


        public GeneralResultKey() {}

        public Long getCyclistId() {
                return cyclistId;
        }

        public void setCyclistId(Long cyclistId) {
                this.cyclistId = cyclistId;
        }

        public Long getCompetitionId() {
                return competitionId;
        }

        public void setCompetitionId(Long competitionId) {
                this.competitionId = competitionId;
        }



}

