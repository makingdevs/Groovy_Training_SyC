import io.vertx.ext.jdbc.JDBCClient
//import io.vertx.ext.asyncsql.MySQLClient

def eb = vertx.eventBus()
def config = [
  user:"makingdevs",
  password: "makingdevs",
  url: "jdbc:mysql://localhost/groovy_db",
  driver_class: "com.mysql.jdbc.Driver"
]
def client = JDBCClient.createNonShared(vertx, config)
//def client = MySQLClient.createNonShared(vertx, config)

eb.consumer("task.create") { message ->
  task = TaskService.instance.createTaskWithMessage(message)
  client.getConnection({ res ->
    if (res.succeeded()) {
      def connection = res.result()
      connection.query("SELECT * FROM issue", { res2 ->
        if (res2.succeeded()) {
          def rs = res2.result()
          println rs
          data = rs.results.collect { row ->
            [
              id: row[0],
              description: row[1],
              priority: row[2],
              date_created: row[3]
            ]
          }
          eb.publish("task.list", data)
        }
      })
    } else {
      println res.properties
    }
  })
}

