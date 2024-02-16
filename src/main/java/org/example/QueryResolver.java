package org.example;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    public String hello() {
        return "Hello, world!";
    }
}