package ahmed.foudi.mappers;

import ahmed.foudi.dto.cyclistdto.cyclistResponseDTO;
import ahmed.foudi.dto.generalresultdto.GeneraResultDTO;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.GeneralResult;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GeneralResultDTOMapper {
    GeneralResult dtoToEntity(GeneraResultDTO dto);
    GeneraResultDTO entityToDto(GeneralResult entity);
}
