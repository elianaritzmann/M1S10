package M1S10.M1S10.Mapper;

import M1S10.M1S10.dtos.OrganizationRequestDto;
import M1S10.M1S10.dtos.OrganizationResponseDto;
import M1S10.M1S10.entities.OrganizationEntity;

import java.util.List;

public class OrganizationMapper {
    
    public static OrganizationResponseDto responseDto (OrganizationEntity organization){
        return new OrganizationResponseDto(
                organization.getId(),
                organization.getName(),
                organization.getContact()
                );
    }

    public static List<OrganizationResponseDto> responseDtos (List<OrganizationEntity>organization){
        return organization.stream().map(OrganizationMapper::responseDto).toList();
    }

    public static OrganizationEntity toEntity(OrganizationEntity organization, OrganizationRequestDto dto) {
        organization.setName(dto.name());
        organization.setContact(dto.contact());

        return organization;

    }


}

