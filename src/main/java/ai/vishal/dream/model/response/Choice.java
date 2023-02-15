package ai.vishal.dream.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Choice {
    String text;
    int index;
    Object logprobs;
    @JsonProperty("finish_reason")
    String finishReason;
}
