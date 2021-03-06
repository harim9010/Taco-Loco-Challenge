
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author Hari
 */
@SpringBootApplication
public class ApplicationInitializer extends SpringBootServletInitializer {
  /**
   * CORS (Cross Origin) configuration related to REST
   * @return
   */
  @Bean
  public FilterRegistrationBean corsFilter() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials( true );
    config.addAllowedOrigin( "*" );
    config.addAllowedHeader( "*" );
    config.addAllowedMethod( "*" );
    source.registerCorsConfiguration( "/**", config );
    FilterRegistrationBean bean = new FilterRegistrationBean( new CorsFilter( source ) );
    bean.setOrder( 0 );
    return bean;
  }

  public static void main( String[] args ) {
    SpringApplication.run( ApplicationInitializer.class, args );
  }

}
