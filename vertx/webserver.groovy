server = vertx.createHttpServer()

server.requestHandler { request ->

  def response = request.response()
  response.putHeader("content-type", "text/plain")
  response.end("Hello world ${new Date()}")

}

server.listen(8181)
