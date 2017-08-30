var eb = new EventBus('http://172.16.0.7:8181/eventbus');

eb.onopen = function() {
  console.log("WebSocket abierto");
  eb.registerHandler('clock-address', function(error, message) {
    //console.log(message);
    $("h1").text(message.body);
  });
}

$("form").on("submit", function(e){
  console.log("Hola mundo");
  e.preventDefault();
});
