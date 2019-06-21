package com.smile.springmvc.mapper;

import com.smile.springmvc.dao.MusicInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicInfoMapper {
    @ResultMap("MusicInfoMap")
    @Select("select * from music_info")
    List<MusicInfo> selectAll(MusicInfo musicInfo);
}