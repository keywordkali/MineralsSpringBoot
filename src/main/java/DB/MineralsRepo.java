package DB;

import org.springframework.data.jpa.repository.JpaRepository;

import Business.Minerals;




public interface MineralsRepo extends JpaRepository<Minerals, Integer> {
	static Minerals findByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}


}
