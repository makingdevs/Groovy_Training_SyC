factura = new XmlSlurper().parse("ESY032314.xml")
factura.declareNamespace(cfdi:'http://www.sat.gob.mx/cfd/3')

println factura.Conceptos.'cfdi:Concepto'.each { println it.'@descripcion' }
