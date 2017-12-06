package io.itrex.docker.simpleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Controller
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, WebMvcAutoConfiguration.class})
@SpringBootApplication
public class SimpleServiceApplication {


  @RequestMapping("/")
  @ResponseBody
  String home() {
    try {
      return "<h1>Hello I am "+InetAddress.getLocalHost().toString()+" friendly host.</h1>"
          + "<p>I have environment variable ${ENVVAR} set on "+ System.getenv("ENVVAR")+"<p>";
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    return "";
  }

  public static void main(String[] args) {
    SpringApplication.run(SimpleServiceApplication.class, args);
  }
}
