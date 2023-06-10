package com.family.lsky.modul;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @ClassName Result
 * @Date 2023-06-10 10:52
 * @AUTHOR family
 **/
@Data
public class Result implements Serializable {
    private Boolean status;
    private String message;
    private Map<Object, Object> data;
}
