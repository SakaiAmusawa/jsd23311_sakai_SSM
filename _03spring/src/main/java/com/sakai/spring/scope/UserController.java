package com.sakai.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/*
singleton单例模式
prototype多例模式
 */
@Scope(value = "singleton")
//@Scope(value = "prototype")
@Controller
public class UserController {
}
