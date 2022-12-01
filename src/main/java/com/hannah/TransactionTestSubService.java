package com.hannah;

import com.hannah.entity.Child;
import com.hannah.entity.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class TransactionTestSubService {

    private final ChildRepository childRepository;

    private final ParentRepository parentRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void excute(long parentId) {

        Parent parent1 = parentRepository.findById(parentId).orElseThrow();

        Child child = Child.builder()
                .id(parent1.getId())
                .userProfileId(parent1.getUserProfileId())
                .parent(parent1)
                .vin(parent1.getVin())
                .createdAt(parent1.getCreatedAt())
                .build();

        childRepository.save(child);

        parent1.changeProcessYn("Y");
    }
}
