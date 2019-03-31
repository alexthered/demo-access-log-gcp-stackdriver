package me.alexthered.demoaccessloggcpstackdriver.controller;


import javax.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * just a simple endpoint to demo the access log
 */
@RestController
@RequestMapping("/v1/hello")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String helloTo(@RequestParam("name") @NotNull String name) {


    return String.format("Hello to %s!", name);
  }
}
