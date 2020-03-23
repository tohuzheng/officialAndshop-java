package com.huzheng.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huzheng.entity.OnlyCode;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OnlyCode)表数据库访问层
 *
 * @author zheng.hu
 * @since 2020-03-23 17:32:19
 */
public interface IOnlyCodeDao extends BaseMapper<OnlyCode> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OnlyCode queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OnlyCode> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param onlyCode 实例对象
     * @return 对象列表
     */
    List<OnlyCode> queryAll(OnlyCode onlyCode);

    /**
     * 新增数据
     *
     * @param onlyCode 实例对象
     * @return 影响行数
     */
    int insertOnlyCode(OnlyCode onlyCode);

    /**
     * 修改数据
     *
     * @param onlyCode 实例对象
     * @return 影响行数
     */
    int updateOnlyCode(OnlyCode onlyCode);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteByIdOnlyCode(Integer id);

}