package com.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.New;

import com.spring.beans.collections.NewPerson;

/**
 * ��̬����������ֱ�ӵ���ĳһ����ľ�̬�����Ϳ��Է���bean��ʵ��
 * @author Administrator
 *
 */
public class StaticCarFactory {
	private static Map<String, Car> cars=new HashMap<String, Car>();
	static{
		cars.put("Audi", new Car("audi",300000));
		cars.put("Ford", new Car("Ford",400000));
	}
	//��̬��������
	public static Car getCar(String name){
		return cars.get(name);
	}
}
