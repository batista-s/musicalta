foi assim que fizemos a configuração do arquivo application.properties.
retiramos ele do repositório remoto para evitar sobrescrever as configs locais de cada uma

spring.application.name=musicalta
spring.datasource.url=jdbc:mysql://localhost:3306/musicalta_db?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
spring.datasource.username=usuario
spring.datasource.password=senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults=false