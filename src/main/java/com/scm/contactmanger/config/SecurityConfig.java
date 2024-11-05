// package com.scm.contactmanger.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// // import org.springframework.security.core.userdetails.User;
// // import org.springframework.security.core.userdetails.UserDetails;
// // import org.springframework.security.core.userdetails.UserDetailsService;
// // import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.authentication.AuthenticationProvider;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;

// @Configuration
// public class SecurityConfig {
//     // Create in Memory-- user--manually

//     // @Bean
//     // public UserDetailsService userDetailsService(){
//     //     UserDetails user1 = User.withDefaultPasswordEncoder()
//     //     .username("admin123")
//     //     .password("abcd")
//     //     .roles("ADMIN","USER")
//     //     .build();
//     //     InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1);
//     //     return inMemoryUserDetailsManager;
//     // }
//     @Bean
//     AuthenticationProvider authenticationProvider(){
//         DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
//         daoAuthenticationProvider.setUserDetailsPasswordService(null);
//         daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//         return daoAuthenticationProvider;
//     }
//     @Bean
//     public PasswordEncoder passwordEncoder(){
//         return new BCryptPasswordEncoder();
//     }
// }
