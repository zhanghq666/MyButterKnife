package com.example.butterknife_compiler;

import java.util.List;

/**
 * @Description 类描述
 * @Author 张海强
 * @Date 2020/7/31 11:02
 */
public class FieldBinding {
    private List<FieldViewBinding> viewBinding;
    private List<FieldClickBinding> clickBinding;

    public FieldBinding(List<FieldViewBinding> viewBinding, List<FieldClickBinding> clickBinding) {
        this.viewBinding = viewBinding;
        this.clickBinding = clickBinding;
    }

    public List<FieldViewBinding> getViewBinding() {
        return viewBinding;
    }

    public void setViewBinding(List<FieldViewBinding> viewBinding) {
        this.viewBinding = viewBinding;
    }

    public List<FieldClickBinding> getClickBinding() {
        return clickBinding;
    }

    public void setClickBinding(List<FieldClickBinding> clickBinding) {
        this.clickBinding = clickBinding;
    }
}
