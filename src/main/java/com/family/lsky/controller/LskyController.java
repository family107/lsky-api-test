package com.family.lsky.controller;

import com.alibaba.fastjson.JSONObject;
import com.family.lsky.modul.BaseMessage;
import com.family.lsky.modul.Query;
import com.family.lsky.modul.Result;
import com.family.lsky.modul.TokenUser;
import com.family.lsky.service.LskyService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @ClassName UploadController
 * @Date 2023-06-10 9:13
 * @AUTHOR family
 **/
@RestController
@RequestMapping("/lsky")
public class LskyController {

    @Resource
    private BaseMessage baseMessage;

    @Resource
    private LskyService lskyService;


    /**
     * 获取token
     *
     * @return
     */
    @PostMapping("/tokens")
    public Result getToken() {
        TokenUser user = new TokenUser(baseMessage.getEmail(), baseMessage.getPassword());
        Object token = lskyService.getToken(user);
        return JSONObject.parseObject(JSONObject.toJSONString(token), Result.class);
    }

    /**
     * 清空touken
     *
     * @return
     */
    @DeleteMapping("/tokens")
    public Result deleteAllToken() {
        Object delete = lskyService.deleteAllToken();
        return JSONObject.parseObject(JSONObject.toJSONString(delete), Result.class);
    }

    /**
     * 获取用信息
     *
     * @return
     */
    @GetMapping("/profile")
    public Result getProfile() {
        Object profile = lskyService.getProfile();
        return JSONObject.parseObject(JSONObject.toJSONString(profile), Result.class);
    }

    /**
     * 获取策略信息
     *
     * @return
     */
    @GetMapping("/strategies")
    public Result getStrategies(@RequestParam(required = false) String keyword) {
        Object strategies = lskyService.getStrategies(keyword);
        return JSONObject.parseObject(JSONObject.toJSONString(strategies), Result.class);
    }

    /**
     * 上传图片
     *
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public Result uploadImage(MultipartFile file) {
        Object upload = lskyService.upload(file);
        return JSONObject.parseObject(JSONObject.toJSONString(upload), Result.class);
    }

    /**
     * 图片列表
     *
     * @param query
     * @return
     */
    @GetMapping("/images")
    public Result getImages(Query query) {
        Object upload = lskyService.getImages(query.getPage(), query.getOrder(), query.getPermission(), query.getAlbum_id(), query.getKeyword());
        return JSONObject.parseObject(JSONObject.toJSONString(upload), Result.class);
    }

    /**
     * 删除图片
     *
     * @param key 图片密钥
     * @return
     */
    @DeleteMapping("/images")
    public Result deleteImage(@RequestParam String key) {
        Object deleteImage = lskyService.deleteImage(key);
        return JSONObject.parseObject(JSONObject.toJSONString(deleteImage), Result.class);
    }

    /**
     * 获取相册列表
     *
     * @return
     */
    @GetMapping("/albums")
    public Result getAlbums(Query query) {
        Object albums = lskyService.getAlbums(query.getPage(), query.getOrder(), query.getKeyword());
        return JSONObject.parseObject(JSONObject.toJSONString(albums), Result.class);
    }

    /**
     * 删除相册
     *
     * @param id
     * @return
     */
    @DeleteMapping("/albums")
    public Result deleteAlbum(@RequestParam String id) {
        Object album = lskyService.deleteAlbum(id);
        return JSONObject.parseObject(JSONObject.toJSONString(album), Result.class);
    }
}
