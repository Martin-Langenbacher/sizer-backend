package de.langenbachersolar.sizer.sizerbackend.controller;

import de.langenbachersolar.sizer.sizerbackend.model.Person;
import de.langenbachersolar.sizer.sizerbackend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable long id) {
        return personRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    
}


/*
@RestController
@CrossOrigin
@RequestMapping("/api/v2/items")
public class ItemRestController {

	private final ItemRepository repository;



	@Autowired
	public ItemRestController(ItemRepository itemRepository) {
		this.repository = itemRepository;
	}



	@GetMapping
	public List<Item> getAll() {
		return repository.findAll();
	}



	@GetMapping("/{id}")
	public Item get(@PathVariable long id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		// ALTERNATIVE: --> return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item newItem(@RequestBody Item newItem) {
		return repository.save(newItem);
	}



	@PutMapping("/{id}")
	public Item replace(@RequestBody Item newItem, @PathVariable Long id) {
		return (Item) repository.findById(id).map(item -> {
			item.setName(newItem.getName());
			item.setAmount(newItem.getAmount());
			item.setRemark(newItem.getRemark());
			item.setLastBought(newItem.getLastBought());
			item.setNeeded(newItem.isNeeded());
			return repository.save(item);

		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}



	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id, HttpServletResponse deleteResponse) {
		try {
			repository.deleteById(id);
			deleteResponse.setStatus(HttpServletResponse.SC_NO_CONTENT);
		} catch (EmptyResultDataAccessException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}



}















   @GetMapping(value = "/{id}")
    public Foo findById(@PathVariable("id") Long id) {
        return RestPreconditions.checkFound(service.findById(id));
    }



    	@GetMapping({"/item", "/item/{id}"})
	public String itemFormGet(
			Model model,
			@PathVariable (required = false) Long id) {

		Item item = new Item();
		if (id != null) {
			Optional<Item> itemOptional = itemRepository.findById(id);
			if (itemOptional.isPresent()) {
				item = itemOptional.get();
			}
		}
		model.addAttribute("item", item);
		return "item";
	}






@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("users")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    // Swagger noch einbinden !!!
    // https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api



}













PersonController
--> Get / Find by ID !!!


1) PersonRepository

Bootstarp: Beispieldaten !!!

Martin-User Personen für Martin und 2 Kinder....









 */