package com.bakerhughes.repairportal.notification_center_services.util.aspects;

import org.springframework.boot.logging.LogLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.temporal.ChronoUnit;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogMethod {

    LogLevel value() default LogLevel.INFO;
    ChronoUnit unit() default ChronoUnit.MILLIS;
    boolean showArgs() default true;
    boolean showResult() default true;
    boolean showExecutionTime() default true;
}
