package com.spittr.mapper.wx.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 微信用户相关数据操作
 * 
 * @author chufei
 * @date 2017年9月25日
 */
@Mapper
public interface WeChatUserMapper {

	/**
	 * 根据用户id登录
	 * 
	 * @param id
	 *            用户id
	 * @return 用户名
	 */
	@Select(value = "select `name` from `wx_user_info` where `id` = #{id}")
	public String getWeChatUserNameByUserId(int id);

}
