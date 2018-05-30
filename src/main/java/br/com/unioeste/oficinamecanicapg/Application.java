package br.com.unioeste.oficinamecanicapg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application {

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}
//
//@Configuration
//public class MainConfig {
//
//   @Bean
//   public BasicDataSource dataSource() throws URISyntaxException {
//      URI dbUri = new URI(System.getenv("DATABASE_URL"));
//
//      String username = dbUri.getUserInfo().split(":")[0];
//      String password = dbUri.getUserInfo().split(":")[1];
//      String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";
//
//      BasicDataSource basicDataSource = new BasicDataSource();
//      basicDataSource.setUrl(dbUrl);
//      basicDataSource.setUsername(username);
//      basicDataSource.setPassword(password);
//
//      return basicDataSource;
//   }
//}