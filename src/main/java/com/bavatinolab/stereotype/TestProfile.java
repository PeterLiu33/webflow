package com.bavatinolab.stereotype;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.*;

/**
 * Created by bavatinolab on 16/12/3.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Profile("test")
public @interface TestProfile {
}
