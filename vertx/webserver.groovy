import io.vertx.ext.web.Router
import io.vertx.core.Vertx

def server = vertx.createHttpServer()
def router = Router.router(vertx)

router.route("/some").handler { routingContext ->
  def response = routingContext.response()
  response.putHeader("content-type", "text/plain")
  response.end("Hello world ${new Date()}")
}
router.get("/foo").handler { routingContext ->
  def response = routingContext.response()
  response.putHeader("content-type", "text/plain")
  response.end("FOO ${new Date()}")
}
router.post("/bar").handler { routingContext ->
  def response = routingContext.response()
  response.putHeader("content-type", "text/plain")
  response.end("BAR ${new Date()}")
}

server.requestHandler(router.&accept).listen(8181)
