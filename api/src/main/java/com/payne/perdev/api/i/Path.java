package com.payne.perdev.api.i;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.api.i
 * Date       2020/07/20 - 14:35
 * Author     Payne.
 * About      类描述：
 */
@Documented
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface Path {
    String value();

    /**
     * Specifies whether the argument value to the annotated method parameter is already URL encoded.
     */
    boolean encoded() default false;
}
