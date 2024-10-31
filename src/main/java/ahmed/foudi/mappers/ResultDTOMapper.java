package ahmed.foudi.mappers;

import ahmed.foudi.dto.resultdto.ResultDTO;
import ahmed.foudi.entities.Result;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResultDTOMapper {
    Result dtoToEntity(ResultDTO dto);
    ResultDTO entityToDto(Result entity);
}
