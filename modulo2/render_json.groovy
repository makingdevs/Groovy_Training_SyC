@GrabConfig(systemClassLoader=true)
@Grab(group='mysql', module='mysql-connector-java', version='5.1.6')

import groovy.sql.Sql
import groovy.json.*

//request.getProperties().each {
//  System.out.println it
//}
System.out.println request.reader.text
System.out.println request.method

db = [
url:'jdbc:mysql://localhost/groovy_db',
//url:'jdbc:oracle:thin:@myhost:1521:orcl',
user:'makingdevs',
password:'makingdevs',
driver:'com.mysql.jdbc.Driver'
//driver:'oracle.jdbc.pool.OracleDataSource'
]

sql = Sql.newInstance(
  db.url,
  db.user,
  db.password,
  db.driver)

  model = [:]
  model.rows = []
  sql.eachRow("select * from issue limit 0,20") {
    model.rows << [id: it.id, description:it.description]
  }
  response.contentType = 'application/json'
json(model)
