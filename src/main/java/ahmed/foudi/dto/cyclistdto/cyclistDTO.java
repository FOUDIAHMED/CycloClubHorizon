package ahmed.foudi.dto.cyclistdto;

import ahmed.foudi.dto.teamdto.TeamDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class cyclistDTO {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String nationality;

    @NotNull()
    private int age ;


    private TeamDTO team;
}
