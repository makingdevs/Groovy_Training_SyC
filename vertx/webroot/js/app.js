var eb = new EventBus('http://172.16.0.7:8181/eventbus');

eb.onopen = function() {
  console.log("WebSocket abierto");
  eb.registerHandler('clock-address', function(error, message) {
    //console.log(message);
    $("h1").text(message.body);
  });
  eb.registerHandler('task.list', function(error, tasks) {
    console.log(tasks);
  });
}

$("form").on("submit", function(e){
  console.log("Hola mundo");
  var taskDescription = $("input[name='description']").val()
  var taskPriority = $("input[name='priority']").val()
  var task = {
    description: taskDescription,
    priority: taskPriority
  };
  console.log(task);
  eb.send("task.create", task);
  e.preventDefault();
});
