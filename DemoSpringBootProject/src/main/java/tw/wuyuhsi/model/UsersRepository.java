package tw.wuyuhsi.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	

	@Query(value = "from Users where userName like concat('%',?1,'%')")
	public List<Users> findUsers(String name);
	

	public List<Users> findByUserNameLike(String name);
	
	
	@Query(value = "select * from Users",nativeQuery = true)
	public List<Users> findAll();
}
