package ahmed.foudi.mappers;

import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import ahmed.foudi.entities.Cyclist;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CyclistDTOMapper {
    Cyclist dtoToEntity(cyclistDTO dto);
    cyclistDTO entityToDto(Cyclist entity);

}
