@Grab(group='log4j', module='log4j', version='1.2.17')
import groovy.util.logging.*

//@Slf4j
@Log4j
class Service {
  def method(){
    log.info "Hello world"
  }
}
new Service().method()
