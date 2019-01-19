package kz.logistic.pl.configs;

import kz.logistic.pl.models.builders.LocalizedMessageModelBuilder;
import kz.logistic.pl.models.builders.impl.MessageSourceLocalizedMessageModelBuilder;
import kz.logistic.pl.models.factories.LocalizedMessageBuilderFactory;
import kz.logistic.pl.models.factories.impl.MessageSourceBuilderFactory;
import kz.logistic.pl.services.impl.DefaultCompanyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
  @Bean
  @Qualifier("defaultCompanyService")
  public DefaultCompanyService companyService() {
    return new DefaultCompanyService();
  }

  @Bean
  public LocalizedMessageBuilderFactory localizedMessageBuilderFactory() {
    return new MessageSourceBuilderFactory();
  }

  @Bean
  public LocalizedMessageModelBuilder localizedMessageModelBuilder() {
    return new MessageSourceLocalizedMessageModelBuilder();
  }
}
