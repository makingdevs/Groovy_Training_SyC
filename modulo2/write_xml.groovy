xmlDocument = new groovy.xml.StreamingMarkupBuilder().bind{
  mkp.xmlDeclaration()
  mkp.declareNamespace(makingdevs:"MakingDevs")
  comment << "Documento con StreamingMarkupBuilder"
  makingdevs.some(name:"numbers"){
    [uno:1, dos:2,tres: 3].each { k, v ->
      (1..10).each {
        iterator(n:it){
          element(v)
        }
      }
    }
  }
}

println xmlDocument
