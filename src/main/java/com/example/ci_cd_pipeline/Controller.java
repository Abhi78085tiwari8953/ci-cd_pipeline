package com.example.ci_cd_pipeline;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping
    public ResponseEntity<String>  host(){
        return ResponseEntity.ok("Ci/Cd pipeline is start");
    }
}
