package ahmed.foudi.mappers;


import ahmed.foudi.dto.teamdto.TeamDTO;
import ahmed.foudi.dto.teamdto.TeamResponseDTO;
import ahmed.foudi.entities.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeamDTOMapper {
    Team dtoToEntity(TeamDTO dto);
    TeamResponseDTO entityToDto(Team entity);
}
