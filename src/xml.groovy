import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('data/sports.xml')
MarkupBuilder builder = new MarkupBuilder(writer)
builder.doubleQuotes=true

builder.sports {
    sport(id: 1){
        name 'Basebal'
    }
    sport(id: 2) {
        name 'Basketbal'
    }
    sport(id: 3){
        name 'Footbal'
    }
    sport(id: 4){
        name 'Hockey'
    }
}