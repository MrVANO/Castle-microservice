package castlems.controller;

import castlems.entity.Castle;
import castlems.entity.Frame;
import castlems.service.CastleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/castle")
public class CastleController {

    @Autowired
    public CastleService castleService;

    @ResponseBody
    @RequestMapping(value = "/allCastles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Castle> getAllCastles() {
        List<Castle> castles = castleService.findAll();
        return castles;
    }

    @ResponseBody
    @RequestMapping(value = "/castleById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Castle getCastleById(Long id) {
        return castleService.getCastleById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/createCastle", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createCastle(@RequestBody Castle castle) {
        return castleService.createCastle(castle);
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/deleteCastle", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCastle(Long id) {
        castleService.deleteCastle(id);
    }
}
