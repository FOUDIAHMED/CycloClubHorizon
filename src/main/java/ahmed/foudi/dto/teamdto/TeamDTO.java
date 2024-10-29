package ahmed.foudi.dto.teamdto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDTO {
    private String name;
    public TeamDTO(String name) {
        this.name = name;
    }

}
