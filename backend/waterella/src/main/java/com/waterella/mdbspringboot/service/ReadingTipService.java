package com.waterella.mdbspringboot.service;

import com.waterella.mdbspringboot.model.ReadingTip;

import java.util.List;

public interface ReadingTipService {
    public ReadingTip saveReadingTip(ReadingTip tip);
    public List<ReadingTip> getAllTips();
}