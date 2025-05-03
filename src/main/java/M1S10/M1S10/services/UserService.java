package M1S10.M1S10.services;

import M1S10.M1S10.dtos.UserRequestDto;
import M1S10.M1S10.dtos.UserResponseDto;
import M1S10.M1S10.entities.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    public List<UserResponseDto> findAll();

    public UserResponseDto findById(Long id);


    public UserResponseDto create(UserRequestDto dto);

    public UserResponseDto update(Long id, UserRequestDto dto);

    public void delete (Long id);


}