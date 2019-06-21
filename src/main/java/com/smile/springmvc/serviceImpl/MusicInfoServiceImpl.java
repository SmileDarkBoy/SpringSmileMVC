package com.smile.springmvc.serviceImpl;

import com.smile.springmvc.dao.MusicInfo;
import com.smile.springmvc.mapper.MusicInfoMapper;
import com.smile.springmvc.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(null);
        return musicInfos;
    }
}