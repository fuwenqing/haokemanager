package cn.haoke.dubbo.api.service;

import cn.haoke.dubbo.api.vo.Pagination;
import cn.haoke.dubbo.api.vo.TableResult;
import cn.haoke.dubbo.server.api.ApiHouseResourcesService;
import cn.haoke.dubbo.server.pojo.HouseResources;
import cn.haoke.dubbo.server.pojo.PageInfo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class HouseResourcesService {
    @Reference(version = "1.0.0")
    private ApiHouseResourcesService apiHouseResourcesService;

    public boolean save(HouseResources houseResources) {
        int result =
                this.apiHouseResourcesService.saveHouseResources(houseResources);
        return result == 1;
    }

    public TableResult queryList(HouseResources houseResources, Integer currentPage,
                                 Integer pageSize) {
        PageInfo<HouseResources> pageInfo = this.apiHouseResourcesService.
                queryHouseResourcesList(currentPage, pageSize, houseResources);
        return new TableResult(pageInfo.getRecords(), new Pagination(currentPage, pageSize, pageInfo.getTotal()));
    }


    public HouseResources queryById(Long id) {
        return  this.apiHouseResourcesService.queryHouseResourcesById(id);
    }
}