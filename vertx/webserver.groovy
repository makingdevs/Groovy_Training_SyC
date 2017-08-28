def server = vertx.createHttpServer()
def router = Router.router(vertx)

router.route().handler { routingContext ->
  def response = rountingContext.response()
  response.putHeader("content-type", "text/plain")
  response.end("Hello world ${new Date()}")
}


server.requestHandler(router.&accept).listen(8181)
