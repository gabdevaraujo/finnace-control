package com.gva.financecontrol.utils.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.gva.financecontrol.utils.ConverterUtils;

public class ConverterUtilsImpl<T, K> implements ConverterUtils<T, K>{

    protected Map<String, String> classAttributes = new HashMap<>();
    protected Map<String, ?> classAttributesValues = new HashMap<>();
    protected Map<String, String> dtoClassAttributes = new HashMap<>();

    @Override
    public Object converter(T t, K k) {
        
        String className = t.getClass().getName();
        Field[] declaredClassFields = t.getClass().getDeclaredFields();
        for(Field field : declaredClassFields){
            if(field.getType().isInstance(Object.class)){

            }
            String type = field.getType().getName();
            classAttributes.put(field.getName(), type);
            //classAttributesValues.put(field.getName(), field.get(Object.class));
        }

        String dtoClassName = k.getClass().getName();
        Field[] declaredDtoClassFields = t.getClass().getDeclaredFields();
        for(Field field : declaredDtoClassFields){
            dtoClassAttributes.put(field.getName(), field.getType().getName());
        }



        return null;
    }

    private class auxClass {
        
    }
    
}