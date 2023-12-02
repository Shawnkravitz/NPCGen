package stk.npcgen.backend.restservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/greeting").allowedOrigins("http://localhost:3000");
        registry.addMapping("/description").allowedOrigins("http://localhost:3000");
        registry.addMapping("/stats").allowedOrigins("http://localhost:3000");
    }
}

