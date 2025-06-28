package com.conceptandcoding.learningspringboot.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    // 1. Execution: Matches a particular method in a particular class
    @Before("execution(public String com.conceptandcoding.learningspringboot.controller.Employee.fetchEmployee())")
    public void beforeMethodUsingExecution() {
        System.out.println("inside beforeMethod Aspect using Execution");
    }

    // (*) wildcard: matches any single item
    // Matches any return type
    @Before("execution(* com.conceptandcoding.learningspringboot.controller.Employee.fetchEmployee())")
    public void beforeMethodUsingExecution11() {
        System.out.println("inside beforeMethod Aspect using Execution11");
    }

    // Matches any method with single parameter String
    @Before("execution(* com.conceptandcoding.learningspringboot.controller.Employee.*(String))")
    public void beforeMethodUsingExecution12() {
        System.out.println("inside beforeMethod Aspect using Execution12");
    }

    // Matches fetchEmployee method that take any single parameter
    @Before("execution(String com.conceptandcoding.learningspringboot.controller.Employee.fetchEmployee(*))")
    public void beforeMethodUsingExecution13() {
        System.out.println("inside beforeMethod Aspect using Execution13");
    }

    // (..) wildcard: matches 0 or More item
    // Matches fetchEmployee method that take any 0 or More parameters
    @Before("execution(String com.conceptandcoding.learningspringboot.controller.Employee.fetchEmployee(..))")
    public void beforeMethodUsingExecution21() {
        System.out.println("inside beforeMethod Aspect using Execution21");
    }

    // Matches fetchEmployee method in 'com.conceptandcoding.learningspringboot' package and subpackage classes
    @Before("execution(String com.conceptandcoding.learningspringboot..fetchEmployee())")
    public void beforeMethodUsingExecution22() {
        System.out.println("inside beforeMethod Aspect using Execution22");
    }

    // Matches any method in 'com.conceptandcoding.learningspringboot' package and subpackage classes
    @Before("execution(String com.conceptandcoding.learningspringboot..*())")
    public void beforeMethodUsingExecution23() {
        System.out.println("inside beforeMethod Aspect using Execution23");
    }

    // 2. Within: Matches all method within any class or package
    // This pointcut will run for each method in the class Employee
    @Before("within(com.conceptandcoding.learningspringboot.controller.Employee)")
    public void beforeMethodUsingWithin1() {
        System.out.println("inside beforeMethod Aspect using Within1");
    }

    // This pointcut will run for each method in this package and subpackage
    @Before("within(com.conceptandcoding.learningspringboot.controller..*)")
    public void beforeMethodUsingWithin2() {
        System.out.println("inside beforeMethod Aspect using Within2");
    }

    // 3. @within: Matches any method in a class which has this annotation
    @Before("@within(org.springframework.stereotype.Service)")
    public void beforeMethodUsingWithinAnnotation() {
        System.out.println("inside beforeMethod Aspect using Within Annotation");
    }

    // 4. @annotation: Matches any method that is annotated with given annotation
    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeMethodUsingAnnotation() {
        System.out.println("inside beforeMethod Aspect using Annotation");
    }

    // 5. Args: Matches any method with particular arguments (or parameters)
    @Before("args(String, int)")
    public void beforeMethodUsingArgs() {
        System.out.println("inside beforeMethod Aspect using Args");
    }

    // If instead of a primitive type, we need an object, then we can give it like this
    // @Before("args(com.conceptandcoding.learningspringboot.service.EmployeeUtil)")
    // public void beforeMethodUsingArgsObject() {
    //     System.out.println("inside beforeMethod Aspect using Args of type Object");
    // }

    // 6. @args: Matches any method with particular parameters and that parameter class is annotated with particular annotation
    // @Before("@args(org.springframework.stereotype.Service)")
    // public void beforeMethodUsingArgsAnnotation() {
    //     System.out.println("inside beforeMethod Aspect using Args Annotation");
    // }

    // 7. target: Matches any method on a particular instance of a class
    @Before("target(com.conceptandcoding.learningspringboot.service.EmployeeUtil)")
    public void beforeMethodUsingTarget() {
        System.out.println("inside beforeMethod Aspect using Target");
    }

    // We can even provide an interface instead of direct class in the Target pointcut
    @Before("target(com.conceptandcoding.learningspringboot.repository.IEmployee)")
    public void beforeMethodUsingTargetForInterface() {
        System.out.println("inside beforeMethod Aspect using Target for Interface");
    }
}
