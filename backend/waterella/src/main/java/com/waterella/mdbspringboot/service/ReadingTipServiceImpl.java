package com.waterella.mdbspringboot.service;

import com.waterella.mdbspringboot.model.ReadingTip;
import com.waterella.mdbspringboot.repository.ReadingTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadingTipServiceImpl implements ReadingTipService {

    @Autowired
    private ReadingTipRepository readingTipRepository;

    @Override
    public ReadingTip saveReadingTip(ReadingTip tip) {
        return readingTipRepository.save(tip);
    }

    @Override
    public List<ReadingTip> getAllTips() {
        return readingTipRepository.findAll();
    }
}
