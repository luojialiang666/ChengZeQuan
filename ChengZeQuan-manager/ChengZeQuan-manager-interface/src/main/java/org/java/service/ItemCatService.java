package org.java.service;

import org.java.common.pojo.EasyUITreeNodeResult;

import java.util.List;

public interface ItemCatService {
    /**
     * 根据父类id进行查询
     * @param parent
     * @return
     */
    List<EasyUITreeNodeResult> getTreeNodeByParetId(Long parent);
}
