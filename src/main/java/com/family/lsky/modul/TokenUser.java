package com.family.lsky.modul;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName TokenUser
 * @Date 2023-06-10 13:18
 * @AUTHOR family
 **/
@Data
@AllArgsConstructor
public class TokenUser {
    private String email;
    private String password;
}
