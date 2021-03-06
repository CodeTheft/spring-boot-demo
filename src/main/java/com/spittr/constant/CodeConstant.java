package com.spittr.constant;

/**
 * 请求响应码常量类
 * 
 * @author chufei
 * @date 2017年4月10日
 */
public class CodeConstant {

	/**
	 * 响应成功
	 */
	public static final String SUCCESS = "0000";

	/***************COMMON SYSTEM CODE CONSTANT**************/
	
	/**
	 * 服务器异常
	 */
	public static final String SERVER_ERROR = "0001";
	
	/**
	 * 获取参数异常
	 */
	public static final String EXCEPTION_GET_PARAM = "0002";

	/**
	 * 参数超出范围
	 */
	public static final String PARAM_OUT_OF_RANGE = "0003";

	/**
	 * 业务处理异常
	 */
	public static final String EXCEPTION_SERVICE = "0004";

	/**
	 * 注册失败
	 */
	public static final String FAIL_REGISTER = "0005";

	/**
	 * 登录失败
	 */
	public static final String FAIL_LOGIN = "0006";

	/***************USER SERVICE CODE CONSTANT**************/
	
	/**
	 * 用户昵称为空
	 */
	public static final String ERR_NICKNAME_MISS = "1001";

	/**
	 * 登录密码为空
	 */
	public static final String ERR_PASSWORD_MISS = "1002";

	/**
	 * 手机号为空
	 */
	public static final String ERR_PHONE_MISS = "1003";

	/**
	 * 用户id为空
	 */
	public static final String ERR_USERID_MISS = "1004";

	/**
	 * 用户昵称已存在
	 */
	public static final String ERR_NICKNAME_EXIST = "1005";

	/**
	 * 手机号已存在
	 */
	public static final String ERR_PHONE_EXIST = "1006";

	/**
	 * 用户不存在
	 */
	public static final String ERR_USER_NOT_EXIST = "1007";

}
