package com.ren.study.common.enums;

/**
 * @author: renjiahui
 * @date: 2022-03-30 23:45
 * @description: 书单更多枚举
 */
public enum BookListMoreTypeEnum {
    NOTHING(1, "无"),
    MORE(2, "更多"),
    EXCHANGE(3, "换一换"),
    LOADING(4, "加载");

    private int value;
    private String name;

    BookListMoreTypeEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
