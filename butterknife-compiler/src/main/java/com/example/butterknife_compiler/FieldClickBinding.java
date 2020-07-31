package com.example.butterknife_compiler;

import javax.lang.model.type.TypeMirror;

/**
 * @Description 类描述
 * @Author 张海强
 * @Date 2020/7/30 19:36
 */
public class FieldClickBinding {
    String fieldName;
    TypeMirror fieldType;
    int[] viewId;
    public FieldClickBinding(String fieldName, TypeMirror fieldType, int[] viewId) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.viewId = viewId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public TypeMirror getFieldType() {
        return fieldType;
    }

    public int[] getViewId() {
        return viewId;
    }
}
