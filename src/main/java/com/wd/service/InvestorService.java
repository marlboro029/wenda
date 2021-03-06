/*
 * @(#)InvestorService.java, 2015/11/4.
 *
 * Copyright 2015 Alibaodu, Inc. All rights reserved.
 * ALIBAODU PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.wd.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.wd.data.ResponseData;
import com.wd.data.investor.InvestorBasicInfo;
import com.wd.data.investor.InvestorIntro;

/**
 * InvestorService
 *
 * @author HOU Zhipeng
 * @date 2016/06/12
 */
public interface InvestorService {
    /**
     * 根据投资人ID获取投资人详情
     * @param investorId：投资人ID
     */
    public ResponseData getInvestorById(Long investorId);


    /**
     * 上传投资者基本信息
     * @param investorBasicInfo
     * @return
     */
    public ResponseData uploadInvestorBasicInfo(InvestorBasicInfo investorBasicInfo);



    /**
     * 上传投资者介绍信息
     * @param investorIntro
     * @return
     */
    public ResponseData uploadInvestorIntro(InvestorIntro investorIntro);

    /**
     * 上传投资人照片
     * @param investorId
     * @param url
     * @return
     */
    public ResponseData uploadInvestorPhoto(Long investorId, List<String> url);

    /**
     *
     */
    public ResponseData getAllInvestorList();




    /**
     * 通过姓名搜索
     * @param name
     * @return
     */
    public ResponseData getListByName(String name);

    /**
     * 全文搜索
     * @param institutionName
     * @param institutionMember
     * @param position
     * @param page
     * @param size
     * @return
     */
//    public ResponseData getFullSearch(String institutionName, String institutionMember, String position, int page, int size);

    /**
     * 通过行业和职位 查询
     * @param firstField
     * @param position
     * @param page
     * @param size
     * @return
     */
    public ResponseData getByFirstField(String firstField, Byte position, int page, int size);

    public ResponseData getInvestorLevel(Long investorId);
    
    
    /**      
	* 方法描述：根据人物类型，分页查找人物
	* 备注：
	*/
    public ResponseData getInvestorPageByType(Byte levelType,int page, int pagesize);
    
    /**      
     * 方法描述： 查询热门人物
     * 备注：
     */
    public ResponseData findByHot(int page, int pagesize);
    /**      
	 * 方法描述： 查询推荐人物
	 * 备注：
	 */
    public ResponseData findBySupport(int page, int pagesize);
}
