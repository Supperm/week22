package com.zhangwen.common.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.zhangwen.common.utils.RandNumUtil;
import com.zhangwen.common.utils.ZHStringUtil;
import com.zw.util.date.DateUtil;
import com.zw.util.random.RandomUtil;

class TPSTest {

	/** 
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	void test1() {
		for (int i = 0; i < 100; i++) {
			TPS tps = new TPS();
			//id从1开始递增
			int a = i+1;
			BigInteger b = new BigInteger(String.valueOf(a));
			tps.setId(b);
			//专家姓名属性值调用ZHStringUtil的getZHName()
			tps.setName(ZHStringUtil.getZHName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间
			tps.setAge(RandomUtil.random(1, 100));
			//薪酬是3万到8万，小数点后2位的随机数
			double d = RandNumUtil.getValue(30000.25, 80000.55, 4);
			BigDecimal b2 = new BigDecimal(d);
			tps.setQian(b2);
			//聘用日期属性值模拟2012年1月1日至今任意随机时间
			Calendar c = Calendar.getInstance();
			c.set(2012, 1, 1);
			Date time2 = c.getTime();
			Calendar cal = Calendar.getInstance();
			Date time = cal.getTime();
			tps.setDate(DateUtil.randomDate(time2, time));
			//显示效果
			System.out.println(tps);
		}
	}

}
