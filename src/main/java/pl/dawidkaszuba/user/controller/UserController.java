package pl.dawidkaszuba.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dawidkaszuba.user.config.UserServiceConfig;
import pl.dawidkaszuba.user.entity.User;
import pl.dawidkaszuba.user.model.Properties;
import pl.dawidkaszuba.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceConfig userServiceConfig;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/properties")
    public String getProperties() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(userServiceConfig.getMsg(), userServiceConfig.getBuildVersion());
        String jsonStr = ow.writeValueAsString(properties);
        return jsonStr;
    }
}
