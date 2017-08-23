import groovy.text.SimpleTemplateEngine

@Singleton
class ViewResolver {
  String resolveView(view, model){
    def fileText = new File(view).text
    def engine = new SimpleTemplateEngine()
    engine.createTemplate(fileText).make([data:model])
  }
}
