package M1S10.M1S10.controllers;

import M1S10.M1S10.dtos.LoginRequestDto;
import M1S10.M1S10.dtos.LoginResponseDto;
import M1S10.M1S10.services.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("login")
public class LoginController {

    private LoginService service;

    @PostMapping
    private LoginResponseDto login(@RequestBody LoginRequestDto dto){
        return service.authenticate(dto);
    }
}
