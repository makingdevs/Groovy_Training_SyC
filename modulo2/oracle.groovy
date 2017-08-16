//@GrabConfig(systemClassLoader=true)
//@Grab(group='oracle', module='jdbc', version='1.4')
//@Grab(group='oracle', module='ojdbc6', version='11.2.0.3')
import groovy.sql.Sql

def db = [
//url:'jdbc:mysql://localhost/groovy_bd', //(groovy_db esla base de datos)
url:'jdbc:oracle:thin:@172.16.1.21:1521:edocta',
user:'edocta',
password:'ist123',
//driver:'com.mysql.jdbc.Driver'
driver:'oracle.jdbc.pool.OracleDataSource'
]

sql= Sql.newInstance(
db.url,
db.user,
db.password,
db.driver)