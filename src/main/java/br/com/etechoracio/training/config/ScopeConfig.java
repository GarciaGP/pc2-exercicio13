package br.com.etechoracio.training.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.etechoracio.common.view.ViewScoped;

@Configuration
public class ScopeConfig {

	@Bean
	public CustomScopeConfigurer getScopeConfigurer() {
		final CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
		final Map<String, Object> scopes = new HashMap<>();
		scopes.put("view", this.getViewScoped());
		scopeConfigurer.setScopes(scopes);
		return scopeConfigurer;
	}

	public ViewScoped getViewScoped() {
		return new ViewScoped();
	}

}
