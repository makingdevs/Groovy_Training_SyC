require 'vertx-web/router'
require 'vertx-web/static_handler'

server = $vertx.create_http_server()
router = VertxWeb::Router.router($vertx)

router.route("/static/*").handler(&VertxWeb::StaticHandler.create().method(:handle))

server.request_handler(&router.method(:accept)).listen(8181)
