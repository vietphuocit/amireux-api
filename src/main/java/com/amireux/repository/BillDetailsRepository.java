package com.amireux.repository;

import com.amireux.model.Bill;
import com.amireux.model.BillDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillDetailsRepository extends JpaRepository<BillDetails, Long> {
    List<BillDetails> findAllByBill(Bill bill);
}
