package ai.vishal.dream.model.response;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GPTResponse {
    String id;
    String object;
    int created;
    String model;
    ArrayList<Choice> choices;
    Usage usage;
}
