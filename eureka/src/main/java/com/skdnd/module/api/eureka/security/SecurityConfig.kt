//package com.skdnd.module.api.eureka.security
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.config.Customizer
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
//import org.springframework.security.core.userdetails.User
//import org.springframework.security.core.userdetails.UserDetails
//import org.springframework.security.core.userdetails.UserDetailsService
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
//import org.springframework.security.provisioning.InMemoryUserDetailsManager
//import org.springframework.security.web.SecurityFilterChain
//
//@Configuration
//@EnableWebSecurity
//open class SecurityConfig {
//
//    @Bean
//    open fun bCryptPasswordEncoder(): BCryptPasswordEncoder {
//        return BCryptPasswordEncoder()
//    }
//
//    @Bean
//    open fun filterChain(http: HttpSecurity): SecurityFilterChain {
//        http
//            .csrf { it.disable() }
//            .authorizeHttpRequests { it.anyRequest().authenticated() }
//            .httpBasic(Customizer.withDefaults())
//        return http.build()
//    }
//
//    @Bean
//    open fun userDetailsService(): UserDetailsService {
//
//        val user: UserDetails = User.builder()
//            .username("test")
//            .password("1234")
//            .roles("ADMIN")
//            .build()
//
//        return InMemoryUserDetailsManager(user)
//    }
//
//
////    @Bean
////    open fun userDetailsService(): UserDetailsService {  // 'open' 추가
////        val user: UserDetails = User.builder()
////            .username("test")
////            .password(bCryptPasswordEncoder().encode("1234"))
////            .roles("ADMIN")
////            .build()
////
////        return InMemoryUserDetailsManager(user)
////    }
//}