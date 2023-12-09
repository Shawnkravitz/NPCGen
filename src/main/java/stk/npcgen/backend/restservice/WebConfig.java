package stk.npcgen.backend.restservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**")
	            .allowedOrigins(
	                "https://main.drt7quxpu2qf2.amplifyapp.com",
	                "https://www.npcworldgenerator.com"
	            )
	            .allowedMethods("GET", "POST", "PUT", "DELETE")
	            .allowedHeaders("*")
	            .allowCredentials(true);
	}
}

