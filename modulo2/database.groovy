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
