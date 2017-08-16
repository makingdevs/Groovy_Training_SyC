@GrabConfig(systemClassLoader=true)
@Grab(group='mysql', module='mysql-connector-java', version='5.1.6')

import groovy.sql.Sql

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

sql.execute "drop table if exists issue;"

sql.execute """
    create table if not exists issue(
        id integer primary key auto_increment,
        description varchar(255),
        priority integer,
        date_created datetime);
"""

sql.execute """
  insert into issue(description,priority,date_created) values
    ('No funciona el Login',1,now()),
    ('No hay estilo CSS',2,now()),
    ('No se puede crear el cliente',3,now()),
    ('Faltan validaciones',4,now()),
    ('No se puede acceder al menu',1,now()),
    ('No se crean facturas',2,now()),
    ('No se puede capturar emisor',3,now()),
    ('No se puede capturar receptor',4,now()),
    ('No se puede acceder al sistema',1,now());
"""

data = ["ISSUE: No sirve la app", 2, new Date() - 20]
sqlInsert = "insert into issue(description, priority, date_created) values(?,?,?)"
sql.execute sqlInsert, data

sql.eachRow("select * from issue") {
    println it
}

dataset = sql.dataSet('issue')

filterIssues = dataset.findAll {
    it.id >= 3 && it.id <= 6
}

println "*"*100
filterIssues.each {
    println it
}

println filterIssues.sql