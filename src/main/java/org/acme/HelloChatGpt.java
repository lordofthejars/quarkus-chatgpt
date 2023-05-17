package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/interact")
public class HelloChatGpt {

    @RestClient
    ChatGptService chatGpt;

    @ConfigProperty(name = "openai.model")
    String openaiModel;

    @ConfigProperty(name = "openai.key")
    String openaiKey;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String completion(String prompt) {
        return chatGpt.completion(getBearer(),
            new ChatGptRequest(openaiModel, prompt))
        .choices.toString();
    }

    private String getBearer() {
        return "Bearer " + openaiKey;
    }
}
