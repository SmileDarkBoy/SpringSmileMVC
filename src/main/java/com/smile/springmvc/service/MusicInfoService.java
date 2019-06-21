package com.smile.springmvc.service;

import com.smile.springmvc.dao.MusicInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MusicInfoService {

    @Transactional
    List<MusicInfo> getMusicInfo(MusicInfo musicInfo);
}