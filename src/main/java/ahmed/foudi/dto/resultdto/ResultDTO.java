package ahmed.foudi.dto.resultdto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;


@Getter
@Setter
public class ResultDTO {
    @NotNull
    private Long stageId;
    @NotNull
    private Long cyclistId;
    private Duration time;
}
