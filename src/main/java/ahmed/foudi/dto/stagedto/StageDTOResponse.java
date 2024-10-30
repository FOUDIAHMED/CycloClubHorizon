package ahmed.foudi.dto.stagedto;

import ahmed.foudi.dto.competitiondto.CompetitionDTO;
import ahmed.foudi.dto.competitiondto.CompetitionDTOResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StageDTOResponse {
    private int number;
    private String startLocation;
    private String endLocation;
    private String type;
    private CompetitionDTOResponse competition;

}
