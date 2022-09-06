package iitu.edu.wmelonback.controller;

import iitu.edu.wmelonback.exception.MelonNotFoundException;
import iitu.edu.wmelonback.model.Melon;
import iitu.edu.wmelonback.service.MelonService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ulan
 * @date 9/6/2022
 */

@RestController
@RequestMapping("/melon")
public class MelonController {

    private final MelonService melonService;

    public MelonController(MelonService melonService) {
        this.melonService = melonService;
    }

    @GetMapping
    public ResponseEntity<List<Melon>> findAllMelons() {
        return new ResponseEntity<>(melonService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Melon> saveMelon(@RequestBody Melon melon){
        return new ResponseEntity<>(melonService.save(melon), HttpStatus.CREATED);
    }

}
