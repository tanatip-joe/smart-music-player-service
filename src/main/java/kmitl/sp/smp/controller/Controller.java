package kmitl.sp.smp.controller;

import kmitl.sp.smp.service.ControllerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Jo on 3/24/2017.
 */
@RestController
@RequestMapping(value = "api/v1/smp")
public class Controller {
    private final ControllerService controllerService;

    @Inject
    public Controller(ControllerService controllerService) {
        this.controllerService = controllerService;
    }

    @RequestMapping(value = "health", method = RequestMethod.GET)
    public boolean getHealth() {
        return true;
    }

    @RequestMapping(value = "artists", method = RequestMethod.GET)
    public List<String> getAllArtist() {
        return controllerService.getAllArtistName();
    }
}
