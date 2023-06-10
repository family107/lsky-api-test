package com.family.lsky.modul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ImagesVo
 * @Date 2023-06-10 11:42
 * @AUTHOR family
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Query {
    //页码
    private Integer page;
    //排序方式，newest=最新，earliest=最早，utmost=最大，least=最小
    private String order;
    //权限，public=公开的,private=私有的
    private String permission;
    //相册ID
    private Integer album_id;
    //筛选关键字
    private String keyword;
}
