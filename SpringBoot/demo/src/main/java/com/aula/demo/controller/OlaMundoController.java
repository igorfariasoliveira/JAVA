package com.aula.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class OlaMundoController {

  @GetMapping("/")
  
  public String olaMundo(){
    return "Ola mundo Spring no VSCode";
  }
}
