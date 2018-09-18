def xml = '''
<sports>
    <sport>
        <name>Football</name>
    </sport>
</sports>
'''

def sports = new XmlSlurper().parseText(xml)

println sports.getClass().getName()
println sports.sport.name