package com.centyun.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.centyun.core.table.KeyValuePair;
import com.centyun.user.domain.Tenant;

@Mapper
public interface TenantMapper {

    void addTenant(Tenant tenant);

    void updateTenant(Tenant tenant);

    Tenant getTenantById(@Param("id") String id);

    List<Tenant> getTenants(@Param("searchValue") String searchValue, @Param("orders") List<KeyValuePair> orders);

    void updateStatus(@Param("ids") List<String> ids, @Param("status") int status, @Param("editor") String editor);

    List<KeyValuePair> getAllTenants();

    int getTenantByName(Tenant tenant);

}
