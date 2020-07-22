package www.maxinhai.com.dynamicmodule.entity;

import lombok.Data;
import java.util.Map;

@Data
@org.springframework.data.mongodb.core.mapping.Document(collection = "document")
public class Document {

    private String name;

    private String description;

    private Map<String, Object> items;

}
