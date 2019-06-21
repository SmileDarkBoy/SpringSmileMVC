package com.smile.springmvc.web;

import com.smile.springmvc.dao.MusicInfo;
import com.smile.springmvc.service.MusicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "接口测试")
@RequestMapping("smile")
public class IndexController {
    private static final String INDEX = "index";
    @Autowired
    private MusicInfoService musicInfoService;

    @RequestMapping("/show")
    public String getIndex() {
        return INDEX;
    }

    @RequestMapping(value = "music", method = {RequestMethod.GET})
    @ResponseBody
    @ApiOperation(value = "获取音乐信息", notes = "演示")
    public List<MusicInfo> getMusicInfo(@RequestBody(required = false) MusicInfo musicInfo) {
        List<MusicInfo> musicInfoList = musicInfoService.getMusicInfo(null);
        return musicInfoList;
    }
}
