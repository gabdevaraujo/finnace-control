package com.gva.financecontrol.utils;

public interface ConverterUtils<T, K> {
    
    Object converter(T t, K k);

}