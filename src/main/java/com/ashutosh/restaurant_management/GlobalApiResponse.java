package com.ashutosh.restaurant_management;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GlobalApiResponse <T>{
    private String message;
    private T data;
}
