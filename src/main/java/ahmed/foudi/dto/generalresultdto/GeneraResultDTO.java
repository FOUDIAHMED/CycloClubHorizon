package ahmed.foudi.dto.generalresultdto;

import ahmed.foudi.dto.competitiondto.CompetitionDTO;
import ahmed.foudi.dto.competitiondto.CompetitionDTOResponse;
import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
@Getter
@Setter
public class GeneraResultDTO {
    private Duration overallTime;

    private int overallRank;

    private cyclistDTO cyclist;
    private CompetitionDTOResponse competition;
}
