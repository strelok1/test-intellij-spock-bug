import spock.lang.Specification

class BugSpec extends Specification {

  def "IntelliJ should not suggest this spec be static"() {
    when:
    true
    then:
    true
  }

}
