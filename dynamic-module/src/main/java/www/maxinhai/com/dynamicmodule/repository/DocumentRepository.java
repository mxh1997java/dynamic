package www.maxinhai.com.dynamicmodule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import www.maxinhai.com.dynamicmodule.entity.Document;
import java.util.UUID;

@Repository
public interface DocumentRepository extends MongoRepository<Document, UUID> {
}
