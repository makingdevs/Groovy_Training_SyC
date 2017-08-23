@Grab(group='org.eclipse.jetty', module='jetty-server', version='9.4.6.v20170531')
@Grab(group='org.eclipse.jetty', module='jetty-servlet', version='9.4.6.v20170531')
@Grab('javax.servlet:javax.servlet-api:3.1.0')
@Grab(group='javax.el', module='javax.el-api', version='3.0.0')
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*

import static org.eclipse.jetty.servlet.ServletContextHandler.*
def server = new Server(1234)
def context = new ServletContextHandler(server, "/", SESSIONS)
context.resourceBase = "."
context.addServlet(GroovyServlet, "*.groovy")
server.start()
