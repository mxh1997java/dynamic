package www.maxinhai.com.dynamicmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import www.maxinhai.com.dynamicmodule.entity.Document;
import www.maxinhai.com.dynamicmodule.repository.DocumentRepository;

@RequestMapping("dynamic")
@RestController
public class DocumentController {

    @Autowired
    private DocumentRepository documentRepository;

    @RequestMapping(value = "addDocument", method = RequestMethod.POST)
    public void addDocument(@RequestBody Document document) throws Exception {
        documentRepository.save(document);
    }

}
