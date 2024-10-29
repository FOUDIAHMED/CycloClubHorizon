package ahmed.foudi.dto.cyclistdto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

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

}
