package com.hannah;

import com.hannah.entity.Child;
import com.hannah.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
