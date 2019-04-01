package com.challenge.productschallenge.scopes;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

@Qualifier
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScoped {
}