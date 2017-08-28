import io.vertx.ext.web.Router
import io.vertx.core.Vertx
import io.vertx.ext.web.handler.StaticHandler

def server = vertx.createHttpServer()
def router = Router.router(vertx)

//def server2 = vertx.createNetServer()
//server2.connectHandler({ socket ->
//  println "Cliente conectado"
//  socket.write "${new Date()}"
//})
//server2.listen(1234, "localhost", { res ->
//  if (res.succeeded()) {
//    println("Server is now listening!")
//  } else {
//    println("Failed to bind!")
//  }
//})

router.route("/static/*").handler(StaticHandler.create().setCachingEnabled(false))

server.requestHandler(router.&accept).listen(8181)
