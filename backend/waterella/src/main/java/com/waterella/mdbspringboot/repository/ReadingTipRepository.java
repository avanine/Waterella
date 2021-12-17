package com.waterella.mdbspringboot.repository;

import com.waterella.mdbspringboot.model.ReadingTip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingTipRepository extends MongoRepository<ReadingTip,String> {
}