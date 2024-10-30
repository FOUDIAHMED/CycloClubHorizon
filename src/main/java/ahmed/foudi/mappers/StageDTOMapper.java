package ahmed.foudi.mappers;

import ahmed.foudi.dto.cyclistdto.cyclistResponseDTO;
import ahmed.foudi.dto.stagedto.StageDTO;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.Stage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StageDTOMapper {
    Stage dtoToEntity(StageDTO dto);
    StageDTO entityToDto(Stage entity);
}
