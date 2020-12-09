package UI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Business.Minerals;
import DB.MineralsRepo;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/minerals") // has to be lower case and if multiple words spinal case. Should be same name
								// as
								// entity
public class MineralsController {
	@Autowired
	private MineralsRepo mineralsRepo;

//list all minerals
	@GetMapping("/")
	public List<Minerals> getAllMinerals() {
		return mineralsRepo.findAll();

	}
	// get pumpkin by id
	@GetMapping("/{id}")
	public Optional getMineral(@PathVariable int id) {
		Optional<Minerals> m = mineralsRepo.findById(id);
		return m;

	}

// add a pumpkin
	@PostMapping("/")
	public Minerals addMineral(@RequestBody Minerals m) {
		return mineralsRepo.save(m);
	}

//update a pumpkin
	@PutMapping("/")
	public Minerals updateMineral(@RequestBody Minerals m) {
		return mineralsRepo.save(m);
	}

	// delete a pumpkin
	@DeleteMapping("/")
	public void deleteMineral(@RequestBody Minerals m) {
		mineralsRepo.delete(m);
	}

}

