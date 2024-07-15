package com.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.model.Hello;

@RestController
public class Controller {
  private static final String template = "This name is %s";

  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Hello hello(@RequestParam(required = false, defaultValue = "Andy")String name){
    System.out.println("===== Get Namee ==========");
    return new Hello(counter.incrementAndGet(), String.format(template, name));
  }
}
