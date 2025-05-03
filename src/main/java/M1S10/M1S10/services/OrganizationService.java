package M1S10.M1S10.services;

import M1S10.M1S10.dtos.OrganizationRequestDto;
import M1S10.M1S10.dtos.OrganizationResponseDto;


import java.util.List;

public interface OrganizationService  {

    public List<OrganizationResponseDto> findAll();

    public OrganizationResponseDto findById(Long id);


    public OrganizationResponseDto create(OrganizationRequestDto dto);

    public OrganizationResponseDto update(Long id, OrganizationRequestDto dto);

    public void delete (Long id);


}