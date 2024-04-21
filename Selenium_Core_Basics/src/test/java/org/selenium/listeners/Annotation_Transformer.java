package org.selenium.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Annotation_Transformer implements IAnnotationTransformer
{
	public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		annotation.setRetryAnalyzer(Retry_Analyzer.class);
	}
}
