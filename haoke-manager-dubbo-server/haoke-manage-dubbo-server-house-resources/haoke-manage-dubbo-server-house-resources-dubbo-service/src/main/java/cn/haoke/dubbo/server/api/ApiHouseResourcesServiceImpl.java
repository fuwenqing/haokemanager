package cn.haoke.dubbo.server.api;

import cn.haoke.dubbo.server.pojo.HouseResources;
import cn.haoke.dubbo.server.pojo.PageInfo;
import cn.haoke.dubbo.server.service.HouseResourcesService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0") // 这是dubbo服务，对外进行暴露
public class ApiHouseResourcesServiceImpl implements ApiHouseResourcesService {

    @Autowired

    private HouseResourcesService houseResourcesService;

    @Override

    public int saveHouseResources(HouseResources houseResources) {
        return this.houseResourcesService.saveHouseResources(houseResources);
    }

    @Override
    public PageInfo<HouseResources> queryHouseResourcesList(int page, int pageSize,
                                                            HouseResources queryCondition) {
        return this.houseResourcesService.queryHouseResourcesList(page, pageSize,
                queryCondition);
    }

    @Override
    public HouseResources queryHouseResourcesById(Long id) {
        return this.houseResourcesService.queryHouseResourcesById(id);
    }

}