package ahmed.foudi.mappers;

import ahmed.foudi.dto.stagedto.StageDTOResponse;
import ahmed.foudi.entities.Stage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StageDTOResponseMapper {
    Stage dtoToEntity(StageDTOResponse dto);
    StageDTOResponse entityToDto(Stage entity);

}
