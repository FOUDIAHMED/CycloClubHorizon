package ahmed.foudi.dto.cyclistdto;

import ahmed.foudi.dto.generalresultdto.GeneraResultDTO;
import ahmed.foudi.dto.teamdto.TeamResponseDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class cyclistResponseDTO {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String nationality;

    @NotNull()
    private int age ;

    private TeamResponseDTO team;

    private List<GeneraResultDTO> generalResults;

}
