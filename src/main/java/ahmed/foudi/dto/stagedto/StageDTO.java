package ahmed.foudi.dto.stagedto;

import ahmed.foudi.dto.competitiondto.CompetitionDTOResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StageDTO {
    private Long id;
    private int number;
    private String startLocation;
    private String endLocation;
    private String type;
}
