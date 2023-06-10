package com.family.lsky.service;

import com.family.lsky.modul.TokenUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@FeignClient(url = "${lsky.baseUrl}", name = "lsky")
@RequestMapping(headers = {"Authorization=${lsky.authorization}", "Accept=application/json"})
public interface LskyService {

    @DeleteMapping("/albums/{id}")
    public Object deleteAlbum(@PathVariable String id);

    @GetMapping("/albums")
    public Object getAlbums(
            @RequestParam Integer page,
            @RequestParam String order,
            @RequestParam String keyword);

    @DeleteMapping("/images/{key}")
    public Object deleteImage(@PathVariable String key);

    @GetMapping("/images")
    public Object getImages(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) String order,
            @RequestParam(required = false) String permission,
            @RequestParam(required = false) Integer album_id,
            @RequestParam(required = false) String keyword
    );

    @PostMapping(value = "/upload", headers = {"Content-Type=multipart/form-data"})
    public Object upload(MultipartFile file);

    @GetMapping("/strategies")
    public Object getStrategies(@RequestParam(required = false) String keyword);

    @GetMapping("/profile")
    public Object getProfile();

    @DeleteMapping("/tokens")
    public Object deleteAllToken();

    @PostMapping("/tokens")
    public Object getToken(@RequestBody TokenUser user);
}
