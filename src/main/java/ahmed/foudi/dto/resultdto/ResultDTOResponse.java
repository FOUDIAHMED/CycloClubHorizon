package ahmed.foudi.dto.resultdto;

import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import ahmed.foudi.dto.stagedto.StageDTO;
import ahmed.foudi.entities.embeddable.CyclistStage;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class ResultDTOResponse {
    private CyclistStage id;
    private Duration time;
    private int rank;
    private StageDTO stage;
    private cyclistDTO cyclist;
}
