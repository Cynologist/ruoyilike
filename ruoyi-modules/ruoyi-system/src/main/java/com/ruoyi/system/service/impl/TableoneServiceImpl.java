package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TableoneMapper;
import com.ruoyi.system.domain.Tableone;
import com.ruoyi.system.service.ITableoneService;

/**
 * 自建一Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-16
 */
@Service
public class TableoneServiceImpl implements ITableoneService 
{
    @Autowired
    private TableoneMapper tableoneMapper;

    /**
     * 查询自建一
     * 
     * @param id 自建一主键
     * @return 自建一
     */
    @Override
    public Tableone selectTableoneById(Long id)
    {
        return tableoneMapper.selectTableoneById(id);
    }

    /**
     * 查询自建一列表
     * 
     * @param tableone 自建一
     * @return 自建一
     */
    @Override
    public List<Tableone> selectTableoneList(Tableone tableone)
    {
        return tableoneMapper.selectTableoneList(tableone);
    }

    /**
     * 新增自建一
     * 
     * @param tableone 自建一
     * @return 结果
     */
    @Override
    public int insertTableone(Tableone tableone)
    {
        tableone.setCreateTime(DateUtils.getNowDate());
        return tableoneMapper.insertTableone(tableone);
    }

    /**
     * 修改自建一
     * 
     * @param tableone 自建一
     * @return 结果
     */
    @Override
    public int updateTableone(Tableone tableone)
    {
        tableone.setUpdateTime(DateUtils.getNowDate());
        return tableoneMapper.updateTableone(tableone);
    }

    /**
     * 批量删除自建一
     * 
     * @param ids 需要删除的自建一主键
     * @return 结果
     */
    @Override
    public int deleteTableoneByIds(Long[] ids)
    {
        return tableoneMapper.deleteTableoneByIds(ids);
    }

    /**
     * 删除自建一信息
     * 
     * @param id 自建一主键
     * @return 结果
     */
    @Override
    public int deleteTableoneById(Long id)
    {
        return tableoneMapper.deleteTableoneById(id);
    }
}
