package ahmed.foudi.mappers;

import ahmed.foudi.dto.competitiondto.CompetitionDTO;
import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import ahmed.foudi.entities.Competition;
import ahmed.foudi.entities.Cyclist;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompetitionDTOMapper {
    Competition dtoToEntity(CompetitionDTO dto);
    CompetitionDTO entityToDto(Competition entity);
}
