package org.acme;

import java.util.List;

public record ChatGptResponse(List<ChatGptChoice> choices) { }
