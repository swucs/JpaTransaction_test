package com.hannah;

import com.hannah.entity.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
public class TransactionTestService {

    private final ParentRepository parentRepository;

    private final TransactionTestSubService transactionTestSubService;

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void test() {
        List<Parent> all = parentRepository.findAll();
        System.out.println("all = " + all);

        for (Parent parent : all) {
            transactionTestSubService.excute(parent.getId());
        }

    }
}
