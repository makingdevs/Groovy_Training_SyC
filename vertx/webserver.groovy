import io.vertx.ext.web.Router
import io.vertx.core.Vertx

def server = vertx.createHttpServer()
def router = Router.router(vertx)

router.route().handler { routingContext ->
  def response = routingContext.response()
  response.putHeader("content-type", "text/plain")
  response.end("Hello world ${new Date()}")
}


server.requestHandler(router.&accept).listen(8181)
