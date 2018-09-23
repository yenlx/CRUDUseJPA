package vn.yenlx.Demo.ViewResolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import View.CsvView;

public class CsvViewResolver implements ViewResolver{

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		return new CsvView();
	}

}
