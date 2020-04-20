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
    @RequestMapping(value = "/createBuilding", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createCastle(@RequestBody BuildingRo buildingRo) {
        return buildingService.createBuidling(buildingRo.getBuilding(), buildingRo.getCastleId());
    }
}