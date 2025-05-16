package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Tableone;

/**
 * 自建一Service接口
 * 
 * @author ruoyi
 * @date 2025-05-16
 */
public interface ITableoneService 
{
    /**
     * 查询自建一
     * 
     * @param id 自建一主键
     * @return 自建一
     */
    public Tableone selectTableoneById(Long id);

    /**
     * 查询自建一列表
     * 
     * @param tableone 自建一
     * @return 自建一集合
     */
    public List<Tableone> selectTableoneList(Tableone tableone);

    /**
     * 新增自建一
     * 
     * @param tableone 自建一
     * @return 结果
     */
    public int insertTableone(Tableone tableone);

    /**
     * 修改自建一
     * 
     * @param tableone 自建一
     * @return 结果
     */
    public int updateTableone(Tableone tableone);

    /**
     * 批量删除自建一
     * 
     * @param ids 需要删除的自建一主键集合
     * @return 结果
     */
    public int deleteTableoneByIds(Long[] ids);

    /**
     * 删除自建一信息
     * 
     * @param id 自建一主键
     * @return 结果
     */
    public int deleteTableoneById(Long id);
}
