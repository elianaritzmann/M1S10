package M1S10.M1S10.configs;

import M1S10.M1S10.enums.UserStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
/*
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        String password = encoder.encode("pass");
        UserDetails userDetails = User.withUsername("user")
                .password(password)
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
*/



//
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .formLogin(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/users/**").hasAnyAuthority(UserStatus.ADMIN.name())
                        .requestMatchers(HttpMethod.POST,"/organizations/**").hasAuthority(UserStatus.ADMIN.name())
                        .requestMatchers(HttpMethod.DELETE,"/organizations/**").hasAuthority(UserStatus.ADMIN.name())
                        .requestMatchers(HttpMethod.PUT,"/organizations/**").hasAuthority(UserStatus.ADMIN.name())
                        .requestMatchers(HttpMethod.GET,"/organizations/**").hasAnyAuthority(
                                UserStatus.ADMIN.name(),
                                UserStatus.USER.name() )
                        .anyRequest().authenticated()
                );
        return http.build();
    }

}
