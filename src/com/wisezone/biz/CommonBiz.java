package com.wisezone.biz;

public interface CommonBiz<T> {
    /**
     * 通用的新增的方法
     */
    int add(T t);

    /**
     * 通用的修改方法
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int remove(int id);

    /**
     * 根据id查询一条数据
     * @param id
     * @return
     */
    T queryOne(int id);
}
