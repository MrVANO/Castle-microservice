package castlems.controller;

import castlems.entity.ro.DefenceRo;
import castlems.service.DefenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/defence")
public class DefenceController {

    @Autowired
    public DefenceService defenceService;

    @ResponseBody
    @RequestMapping(value = "/createBallista", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createBallista(@RequestBody DefenceRo defenceRo) {
        return defenceService.createBallista(defenceRo.getCastleId(), defenceRo.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createBarraks", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createBarraks(@RequestBody DefenceRo defenceRo) {
        return defenceService.createBarraks(defenceRo.getCastleId(), defenceRo.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createMoat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createMoat(@RequestBody DefenceRo defenceRo) {
        return defenceService.createMoat(defenceRo.getCastleId(), defenceRo.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createWalls", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createWalls(@RequestBody DefenceRo defenceRo) {
        return defenceService.createWalls(defenceRo.getCastleId(), defenceRo.getName());
    }
}