package pl.wsiz.iid6.patient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/medicine/allMedicine**").hasRole("ADMIN")
                .antMatchers("/badanie/all**").hasRole("ADMIN")
                .antMatchers("/patient/patientsall**").hasRole("ADMIN")
                .antMatchers("/recepta/all**").hasRole("ADMIN")
                .antMatchers("/skierowanie/all**").hasRole("ADMIN")
                .antMatchers("/medicine/**").hasRole("ADMIN")
                .antMatchers("/badanie/**").hasRole("ADMIN")
                .antMatchers("/patient/**").hasRole("ADMIN")
                .antMatchers("/recepta/**").hasRole("ADMIN")
                .antMatchers("/skierowanie/**").hasRole("USER")
                .antMatchers("/medicine/**").hasRole("USER")
                .antMatchers("/badanie/**").hasRole("USER")
                .antMatchers("/patient/**").hasRole("USER")
                .antMatchers("/recepta/**").hasRole("USER")
                .antMatchers("/skierowanie/**").hasRole("USER")
                .antMatchers("/api/**").hasRole("USER")

                .anyRequest().permitAll()
                .and()
                .formLogin().permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("user")
                        .roles("USER")
                        .build();
        UserDetails admin =
                User.withDefaultPasswordEncoder()
                        .username("admin")
                        .password("admin")
                        .roles("ADMIN")
                        .build();
        return new InMemoryUserDetailsManager(user, admin); }
}
