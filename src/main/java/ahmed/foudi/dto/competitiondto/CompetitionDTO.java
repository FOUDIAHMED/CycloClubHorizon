package ahmed.foudi.dto.competitiondto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class CompetitionDTO {
    private int id;
    private String name;
    private int year;
    private LocalDate startDate;
    private LocalDate endDate;

}
