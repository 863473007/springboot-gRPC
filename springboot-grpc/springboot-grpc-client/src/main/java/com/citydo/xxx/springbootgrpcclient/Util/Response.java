package com.citydo.xxx.springbootgrpcclient.Util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    int state;
    String message;
    Object object;
}
