package castlems.controller;

import castlems.entity.Building;
import castlems.entity.ro.BuildingRo;
import castlems.service.BuildingService;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/building")
public class BuildingController {

    @Autowired
    public BuildingService buildingService;

    @ResponseBody
    @RequestMapping(value = "/createHouse", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createHouse(@RequestBody BuildingRo buildingRo) {
        return buildingService.createHouse(buildingRo.getCastleId(), buildingRo.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createForge", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createForge(@RequestBody BuildingRo buildingRo) {
        return buildingService.createForge(buildingRo.getCastleId(), buildingRo.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createCoffers", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createCoffers(@RequestBody BuildingRo buildingRo) {
        return buildingService.createCoffers(buildingRo.getCastleId(), buildingRo.getName());
    }
}