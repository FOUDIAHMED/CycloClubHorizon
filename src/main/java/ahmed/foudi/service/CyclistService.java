package ahmed.foudi.service;

import ahmed.foudi.dao.CyclistDAO;
import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import ahmed.foudi.dto.cyclistdto.cyclistResponseDTO;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.mappers.CyclistDTOMapper;
import ahmed.foudi.mappers.CyclistResponseDTOMapper;
import ahmed.foudi.mappers.TeamDTOMapper;
import ahmed.foudi.service.interfaces.CyclistServiceI;

import java.util.List;
import java.util.stream.Collectors;

public class CyclistService implements CyclistServiceI {
    private final CyclistDAO cyclistDAO;
    private final CyclistResponseDTOMapper cyclistResponseDTOMapper;
    private final CyclistDTOMapper cyclistDTOMapper;
    public CyclistService(CyclistDAO cyclistDAO, CyclistResponseDTOMapper teamDTOMapper, CyclistDTOMapper cyclistDTOMapper) {
        this.cyclistDAO = cyclistDAO;
        this.cyclistResponseDTOMapper = teamDTOMapper;
        this.cyclistDTOMapper = cyclistDTOMapper;
    }





    @Override
    public List<cyclistDTO> findAll() {
        List<Cyclist> cyclists =cyclistDAO.findAll();
        return cyclists.stream().map(cyclistDTOMapper::entityToDto).collect(Collectors.toList());

    }


    @Override
    public cyclistResponseDTO findById(Long id) {
        Cyclist cyclist= cyclistDAO.findOne(id);
        return cyclistResponseDTOMapper.entityToDto(cyclist);
    }

    public void update(Cyclist cyclist) {
        cyclistDAO.update(cyclist);
    }

    @Override
    public void save(Cyclist cyclist) {
        cyclistDAO.create(cyclist);

    }

    @Override
    public void delete(Cyclist cyclist) {
        cyclistDAO.delete(cyclist);

    }


    @Override
    public void delete(Long id) {
        cyclistDAO.deleteById(id);

    }
}
