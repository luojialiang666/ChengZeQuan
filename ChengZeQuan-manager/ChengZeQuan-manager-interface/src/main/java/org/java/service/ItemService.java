package org.java.service;

import org.java.common.pojo.EasyUIDataGrideResult;
import org.java.pojo.TbItem;
/**
 * 商品服务
 * @author yan
 *
 */
public interface ItemService {
    /**
     * 根据id查询对象
     * @param id	商品id
     * @return		商品对象
     */
    TbItem getById(Long id);
    /**
     * 针对easyui的datagride做数据分页展示
     * @param pageNow	当前的页码
     * @param pageSize	每页显示的信息条数
     * @return			一页信息
     */
    EasyUIDataGrideResult getItemList(Integer pageNow,Integer pageSize);
}