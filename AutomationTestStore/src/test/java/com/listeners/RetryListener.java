package com.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryListener implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		Class<? extends IRetryAnalyzer> retry = annotation.getRetryAnalyzerClass();

		if (retry == null) {

			annotation.setRetryAnalyzer(RetryAnalyzer.class);
		}
	}

}
