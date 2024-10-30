package ahmed.foudi.dto.competitiondto;

import ahmed.foudi.dto.stagedto.StageDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter

public class CompetitionDTO {
    private int id;
    private String name;
    private int year;
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<StageDTO> stage;

}
