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
import java.util.Optional;

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
    public ResponseEntity<Melon> saveMelon(@RequestBody Melon melon) {
        return new ResponseEntity<>(melonService.save(melon), HttpStatus.CREATED);
    }

    @PutMapping("/id/{melonId}")
    public ResponseEntity<Melon> updateMelon(@RequestBody Melon melon, @PathVariable Long melonId){
        Optional<Melon> melonOptional = melonService.findById(melonId);
        if (melonOptional.isPresent()) {
            Melon _melon = melonOptional.get();
            _melon.setLocation(melon.getLocation());
            _melon.setColor(melon.getColor());
            _melon.setCount(melon.getCount());
            _melon.setImage(melon.getImage());
            _melon.setType(melon.getType());
            _melon.setMaturationDate(melon.getMaturationDate());
            _melon.setPlantingDate(melon.getPlantingDate());
            return new ResponseEntity<>(melonService.save(_melon), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/id/{melonId}")
    public ResponseEntity<Melon> deleteMelon(@PathVariable Long melonId) {
        melonService.deleteById(melonId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
