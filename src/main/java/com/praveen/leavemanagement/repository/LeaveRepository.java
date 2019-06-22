package com.praveen.leavemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.leavemanagement.domains.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Long> {

}
