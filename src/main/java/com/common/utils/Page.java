package com.common.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Harry Chou
 * @date 2019/3/29
 */
@Getter
@Setter
public class Page<T> {
	private int total;
	private int page;
	private int size;
    private List<T> rows;
}
