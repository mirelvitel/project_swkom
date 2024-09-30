package org.example.swkomproject.components;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/documents")  // Updated route here
public class DocumentsController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "Dummy response from backend!";
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadDocument(@RequestParam("file") MultipartFile file) {
        return new ResponseEntity<>("Document uploaded and indexed successfully!", HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchDocuments(@RequestParam String query) {
        return ResponseEntity.ok("Search results based on query: " + query);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDocument(@PathVariable String id, @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok("Document updated successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDocument(@PathVariable String id) {
        return ResponseEntity.ok("Document deleted successfully!");
    }
}
