def eb = vertx.eventBus()
def sd = vertx.sharedData()
def tasks = sd.getLocalMap("tasks")
//def tasks = sd.getClusterWideMap("tasks")

eb.consumer("task.create") { message ->
  task = [
    description: message.body().description,
    priority: message.body().priority
  ]
  tasks.put(UUID.randomUUID().toString(), task)
  eb.publish("task.list", tasks)
}

