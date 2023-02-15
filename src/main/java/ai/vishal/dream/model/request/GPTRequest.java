package ai.vishal.dream.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GPTRequest {
    String model = "text-davinci-003";
    String prompt;
    @JsonProperty("max_tokens")
    int maxTokens = 3000;
}
