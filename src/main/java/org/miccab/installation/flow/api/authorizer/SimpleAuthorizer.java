package org.miccab.installation.flow.api.authorizer;

import io.micronaut.context.annotation.Value;
import io.micronaut.function.aws.MicronautRequestHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SimpleAuthorizer extends MicronautRequestHandler<Map<String, Object>, Map<String, Object>> {
    @Value("${AUTHORIZATION_KEY}")
    private String authorizationKey;

    @Override
    public Map<String, Object> execute(Map<String, Object> input) {
        boolean authorized = isAuthorized(input);
        String principalId = "user|a1b2c3d4"; // The principal user identifier
        String methodArn = (String) input.get("methodArn");

        Map<String, Object> authResponse = new HashMap<>();
        authResponse.put("principalId", principalId);

        Map<String, Object> policyDocument = new HashMap<>();
        policyDocument.put("Version", "2012-10-17");

        Map<String, String> statementOne = new HashMap<>();
        statementOne.put("Action", "execute-api:Invoke");
        statementOne.put("Effect", authorized ? "Allow" : "Deny");
        statementOne.put("Resource", methodArn);

        policyDocument.put("Statement", new Map[]{statementOne});
        authResponse.put("policyDocument", policyDocument);
        return authResponse;
    }

    private boolean isAuthorized(Map<String, Object> input) {
        Map<String, String> headers = (Map<String, String>) input.get("headers");
        String authorizationHeader = Optional.ofNullable(headers)
                .map(h -> h.get("Authorization"))
                .orElse(null);
        return authorizationKey.equals(authorizationHeader);
    }
}
