def eb = vertx.eventBus()
def sd = vertx.sharedData()
def tasks = sd.getLocalMap("tasks")
if(tasks.isEmpty()) tasks.put("data", [])
//def tasks = sd.getClusterWideMap("tasks")

eb.consumer("task.create") { message ->
  task = TaskService.instance.createTaskWithMessage(message)
  data = tasks.get("data")
  data << task
  tasks.put("data", data)
  eb.publish("task.list", data)
}

