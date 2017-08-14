import groovy.json.*

def payload = new URL("https://api.github.com/users/neodevelop/repos").text

def document = new JsonSlurper().parseText(payload)

println document*.full_name
