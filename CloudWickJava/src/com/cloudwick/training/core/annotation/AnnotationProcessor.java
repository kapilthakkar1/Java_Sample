package com.cloudwick.training.core.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationProcessor {

	public static void main(String args[])
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		UserAnnotation uobj = new UserAnnotation();
		Class cl = uobj.getClass();
		Method[] mAm = cl.getMethods();

		for (Method m : mAm) {
			System.out.println("Method name:" + m.getName());
			Monitor mon = m.getAnnotation(Monitor.class);

			if (mon != null) {
				m.invoke(uobj, 11);
			}
		}

	}
}


