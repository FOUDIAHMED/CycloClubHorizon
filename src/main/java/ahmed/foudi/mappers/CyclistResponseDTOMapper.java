package ahmed.foudi.mappers;

import ahmed.foudi.dto.cyclistdto.cyclistResponseDTO;
import ahmed.foudi.entities.Cyclist;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CyclistResponseDTOMapper {
    Cyclist dtoToEntity(cyclistResponseDTO dto);
    cyclistResponseDTO entityToDto(Cyclist entity);
}
