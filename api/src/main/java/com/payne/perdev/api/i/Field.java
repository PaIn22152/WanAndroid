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
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface Field {
    String value();

    /** Specifies whether the {@linkplain #value() name} and value are already URL encoded. */
    boolean encoded() default false;
}

