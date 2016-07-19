package main.groovy.com.lofitskyi.controller

import main.groovy.com.lofitskyi.entity.Contact
import main.groovy.com.lofitskyi.repository.ContactRepository

@Grab("thymeleaf-spring4")

@Controller
@RequestMapping("/")
class ContactController {

    @Autowired
    ContactRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    String home(Map<String, Object> model){
        List<Contact> contacts = repository.findAll()
        model.put("contacts", contacts)
        "home"
    }

    @RequestMapping(method = RequestMethod.POST)
    String home(Contact contact){
        repository.save(contact)
        "redirect:/"
    }
}
