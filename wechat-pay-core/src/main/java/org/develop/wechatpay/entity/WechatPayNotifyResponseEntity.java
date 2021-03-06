package org.develop.wechatpay.entity;

import org.develop.wechatpay.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

/**
 * 支付结果通知响应实体<br/>
 * 官方文档：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_7
 * 
 * @author qiuzhenhao
 *
 */
@Getter
@Setter
public class WechatPayNotifyResponseEntity {

	/* 返回状态码 */
	@XmlElement("return_code")
	private String returnCode;

	/* 返回信息 */
	@XmlElement("return_msg")
	private String returnMsg;
}
