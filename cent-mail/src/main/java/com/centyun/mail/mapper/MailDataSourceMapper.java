package com.centyun.mail.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.centyun.mail.domain.MailDataSource;

@Mapper
public interface MailDataSourceMapper {
	
	void addMailDataSource(MailDataSource mailDataSource);
	
	void updateMailDataSource(MailDataSource mailDataSource);
	
	void deleteMailDataSource(MailDataSource mailDataSource);
	
	MailDataSource getMailDataSourceById(String id, String tenantId);
	
	List<MailDataSource> getMailDataSources(String tenantId);

}
