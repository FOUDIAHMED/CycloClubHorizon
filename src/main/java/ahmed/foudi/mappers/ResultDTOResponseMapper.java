package ahmed.foudi.mappers;

import ahmed.foudi.dto.resultdto.ResultDTOResponse;
import ahmed.foudi.entities.Result;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResultDTOResponseMapper {
    Result dtoToEntity(ResultDTOResponse dto);
    ResultDTOResponse entityToDto(Result entity);
}
