package ahmed.foudi.mappers;

import ahmed.foudi.dto.competitiondto.CompetitionDTOResponse;
import ahmed.foudi.entities.Competition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompetitionDTOResponseMapper {
    Competition dtoToEntity(CompetitionDTOResponse dto);
    CompetitionDTOResponse entityToDto(Competition entity);
}
