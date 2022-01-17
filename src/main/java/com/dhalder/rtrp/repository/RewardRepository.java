package com.dhalder.rtrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dhalder.rtrp.model.TransactionUnit;

@Repository
public interface RewardRepository extends JpaRepository<TransactionUnit, Long>{

	@Query(value = "SELECT * FROM TRANSACTION_UNIT u where to_char(u.transaction_date, 'MONTH')=?", nativeQuery = true)
	List<TransactionUnit> getTransactionsByMonth(String month);

}
