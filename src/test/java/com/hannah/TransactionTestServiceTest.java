package com.hannah;

import com.hannah.entity.Parent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransactionTestServiceTest {


    @Autowired
    TransactionTestService transactionTestService;

    @Autowired
    ParentRepository parentRepository;


    @Test
    @Commit
    void create() {

        for (int i = 0; i < 10; i++) {

            Parent parent = Parent.builder()
                    .id(Long.valueOf(i))
                    .vin("vin" + i)
                    .createdAt(LocalDateTime.now())
                    .userProfileId("profile" + i)
                    .build();

            parentRepository.save(parent);

        }
    }

    @Test
    void test1() {
        transactionTestService.test();
    }
}