package com.zhangwen.common.utils;

import java.util.Random;

import com.zw.util.random.RandomUtil;

public class RandNumUtil {

	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87
	public static double getValue(final double min, final double max,final int scale){
		String sMin = String.valueOf(min);
		String sMax = String.valueOf(max);
		String[] split = sMin.split("\\.");
		String[] split1 = sMax.split("\\.");
		int i = RandomUtil.random(Integer.parseInt(split[0]), Integer.parseInt(split1[0]));
		int p = RandomUtil.random(Integer.parseInt(split[1]), Integer.parseInt(split1[1]));
		//System.out.println(p);
		String s = ".";
		String o = String.valueOf(i)+s+String.valueOf(p);
		Double of = Double.valueOf(o);
		//System.out.println(of);
		return of;
	}
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值
	public static int random(int min, int max){
		Random r = new Random();
		return r.nextInt(max -1 - min + 1) + min;
	}
}
