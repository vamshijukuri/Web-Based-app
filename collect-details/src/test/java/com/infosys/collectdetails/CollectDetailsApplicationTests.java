package com.infosys.collectdetails;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SpringBootTest
public class CollectDetailsApplicationTests {

	@Repository
	public interface StudentRepository extends JpaRepository<CollectDetailsApplication, Long>{

	}

}
