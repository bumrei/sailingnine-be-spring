package com.cicd.sailingninebespring.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    // ModelMapper 세팅
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true) // This enables field matching process btw DTO and Entity.
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE) // This allows private fields to be matched
                .setMatchingStrategy(MatchingStrategies.LOOSE);
                /* Loosely matches sources.
                *   -> It means : Loosely matches by checking only the last destination property in a hierarchy.
                */

        return modelMapper;
    }
}
