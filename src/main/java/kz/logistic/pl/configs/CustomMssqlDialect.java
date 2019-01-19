package kz.logistic.pl.configs;


import org.hibernate.dialect.SQLServer2012Dialect;

import java.sql.Types;

public class CustomMssqlDialect extends SQLServer2012Dialect {
  public CustomMssqlDialect() {
    this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
  }
}
