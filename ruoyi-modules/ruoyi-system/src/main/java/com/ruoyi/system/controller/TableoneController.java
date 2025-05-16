package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.system.domain.Tableone;
import com.ruoyi.system.service.ITableoneService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 自建一Controller
 * 
 * @author ruoyi
 * @date 2025-05-16
 */
@RestController
@RequestMapping("/tableone")
public class TableoneController extends BaseController
{
    @Autowired
    private ITableoneService tableoneService;

    /**
     * 查询自建一列表
     */
    @RequiresPermissions("system:tableone:list")
    @GetMapping("/list")
    public TableDataInfo list(Tableone tableone)
    {
        startPage();
        List<Tableone> list = tableoneService.selectTableoneList(tableone);
        return getDataTable(list);
    }

    /**
     * 导出自建一列表
     */
    @RequiresPermissions("system:tableone:export")
    @Log(title = "自建一", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Tableone tableone)
    {
        List<Tableone> list = tableoneService.selectTableoneList(tableone);
        ExcelUtil<Tableone> util = new ExcelUtil<Tableone>(Tableone.class);
        util.exportExcel(response, list, "自建一数据");
    }

    /**
     * 获取自建一详细信息
     */
    @RequiresPermissions("system:tableone:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tableoneService.selectTableoneById(id));
    }

    /**
     * 新增自建一
     */
    @RequiresPermissions("system:tableone:add")
    @Log(title = "自建一", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Tableone tableone)
    {
        return toAjax(tableoneService.insertTableone(tableone));
    }

    /**
     * 修改自建一
     */
    @RequiresPermissions("system:tableone:edit")
    @Log(title = "自建一", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Tableone tableone)
    {
        return toAjax(tableoneService.updateTableone(tableone));
    }

    /**
     * 删除自建一
     */
    @RequiresPermissions("system:tableone:remove")
    @Log(title = "自建一", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tableoneService.deleteTableoneByIds(ids));
    }
}
