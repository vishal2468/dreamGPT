package ai.vishal.dream.model.mongo;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    String email;
    String name;
}
