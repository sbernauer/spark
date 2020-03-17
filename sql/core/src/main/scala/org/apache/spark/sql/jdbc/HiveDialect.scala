package org.apache.spark.sql.jdbc

object HiveDialect extends JdbcDialect {

  override def canHandle(url: String): Boolean = url.startsWith("jdbc:hive2")

  override def quoteIdentifier(colName: String): String = s"`$colName`"
}