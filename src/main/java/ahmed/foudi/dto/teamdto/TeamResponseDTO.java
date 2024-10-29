package ahmed.foudi.dto.teamdto;

import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class TeamResponseDTO {
    private Long id;
    private String name;
    private Set<cyclistDTO> cyclists;
}
