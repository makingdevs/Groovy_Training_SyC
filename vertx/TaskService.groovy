@Singleton
class TaskService {
  def createTaskWithMessage(message){
    [
    id: UUID.randomUUID().toString(),
    description: message.body().description,
    priority: message.body().priority,
    date_created: new Date().format("dd/MM/yyyy hh:mm:ss")
    ]
  }
}
